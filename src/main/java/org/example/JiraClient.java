package org.example;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Client for interacting with Jira API to retrieve issue information.
 */
public class JiraClient {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;
    private final String baseUrl;
    private final String authHeader;

    /**
     * Constructs a JiraClient.
     * 
     * @param baseUrl   Base URL of the Jira instance (e.g., https://your-domain.atlassian.net)
     * @param email     User email for authentication
     * @param apiToken  API token for authentication
     */
    public JiraClient(String baseUrl, String email, String apiToken) {
        this.baseUrl = baseUrl;
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
        String credentials = email + ":" + apiToken;
        String encoded = Base64.getEncoder()
            .encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
        this.authHeader = "Basic " + encoded;
    }

    /**
     * Retrieves the summary (title) of the specified Jira issue.
     * 
     * @param issueKey The key of the Jira issue (e.g., SCRUM-3)
     * @return The issue summary
     * @throws Exception if the request fails or JSON parsing fails
     */
    public String getIssueTitle(String issueKey) throws Exception {
        String url = String.format("%s/rest/api/3/issue/%s", baseUrl, issueKey);
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("Authorization", authHeader)
            .header("Accept", "application/json")
            .GET()
            .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to get issue: HTTP " + response.statusCode()
                + " - " + response.body());
        }

        JsonNode root = objectMapper.readTree(response.body());
        return root.path("fields").path("summary").asText();
    }
}
