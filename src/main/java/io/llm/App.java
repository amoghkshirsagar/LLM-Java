package io.llm;

import io.llm.processor.AiAgent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting the application");

        AiAgent aiAgent = new AiAgent("deepseek-r1:1.5b");
        String aiResponse = aiAgent.generateAiResponse("In one line tell what is sky color?");
        System.out.println("Ollama Response: " + aiResponse);
    }
}