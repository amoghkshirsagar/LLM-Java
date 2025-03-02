// import java.net.URI;
// import java.net.http.HttpClient;
// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;
// import org.json.JSONObject;

// public class Agent {
//     private String model;
//     private String prompt;

//     public Agent(String model, String prompt) {
//         this.model = model; // Change model name as needed
//         this.prompt = prompt;
//         // String response = generateResponse(model, prompt);
//         // System.out.println("Ollama Response: " + response);
//     }

//     // public static String generateResponse(String model, String prompt) {
//     //     try {
//     //         HttpClient client = HttpClient.newHttpClient();
//     //         JSONObject json = new JSONObject();
//     //         json.put("model", model);
//     //         json.put("prompt", prompt);
            
//     //         HttpRequest request = HttpRequest.newBuilder()
//     //             .uri(URI.create("http://localhost:11434/api/generate"))
//     //             .header("Content-Type", "application/json")
//     //             .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
//     //             .build();

//     //         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//     //         JSONObject jsonResponse = new JSONObject(response.body());
//     //         return jsonResponse.getJSONArray("response").getString(0);
//     //     } catch (Exception e) {
//     //         e.printStackTrace();
//     //         return "Error calling Ollama API";
//     //     }
//     // }
// }
