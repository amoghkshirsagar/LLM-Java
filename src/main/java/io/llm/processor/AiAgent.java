package io.llm.processor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

import io.llm.interfaces.AiRequestProcessable;


public class AiAgent implements AiRequestProcessable {
    private String model;
    private String aiEndpoint;

    public AiAgent(String model) {
        this.model = model;
        this.aiEndpoint = "http://localhost:11434/api/generate";
    }

    @Override
    public String generateAiResponse(String prompt) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            JSONObject json = new JSONObject();
            json.put("model", model);
            json.put("prompt", prompt);
            json.put("stream", false);
            
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(aiEndpoint))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject jsonResponse = new JSONObject(response.body());
            return jsonResponse.getString("response");
        } catch (Exception e) {
            e.printStackTrace();
            return "Error calling Ollama API";
        }
    }
    
}
