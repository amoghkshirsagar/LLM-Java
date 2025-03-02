package io.llm.interfaces;

public interface AiRequestProcessable {
    /**
     * Generate a response from the AI model for given prompt
     * @param model
     * @param prompt
     * @return String
     * @throws UnsupportedOperationException
     */
    default String generateAiResponse(String prompt) {
        throw new UnsupportedOperationException("Not implemented");
    }
}