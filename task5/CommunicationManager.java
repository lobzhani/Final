package finalexam.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommunicationManager {

    private String endpoint;

    public CommunicationManager() {
        // Default constructor, or you may initialize fields here
    }

    public String sendUserMessage(String message) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String input = "{\"message\": \"" + message + "\"}";
            conn.getOutputStream().write(input.getBytes());

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            return "Response from server: " + response.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    // Setter for endpoint
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
