package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.err.println("Usage: java -jar app.jar <baseUrl> <email> <apiToken> <issueKey>");
            System.exit(1);
        }
        String baseUrl = args[0];
        String email = args[1];
        String apiToken = args[2];
        String issueKey = args[3];
        try {
            JiraClient client = new JiraClient(baseUrl, email, apiToken);
            String summary = client.getIssueTitle(issueKey);
            System.out.println("Issue " + issueKey + " summary: " + summary);
        } catch (Exception e) {
            System.err.println("Error fetching issue summary: " + e.getMessage());
            System.exit(1);
        }
    }
}
