package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    /**
     * Entry point. Expects the thread JSON as the first argument.
     * Prints the Jira ticket title (summary) from the first element in the thread array.
     */
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("No thread JSON provided");
            return;
        }
        String threadJson = args[0];
        String title = getIssueTitle(threadJson);
        System.out.println(title != null ? title : "");
    }

    /**
     * Parses the thread JSON array and returns the "summary" of its first element.
     *
     * @param threadJson JSON array string containing thread/context elements
     * @return the summary text if present, otherwise null
     * @throws Exception on JSON parsing errors
     */
    public static String getIssueTitle(String threadJson) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(threadJson);
        if (root.isArray() && root.size() > 0) {
            JsonNode first = root.get(0);
            if (first.has("summary")) {
                return first.get("summary").asText();
            }
        }
        return null;
    }
}