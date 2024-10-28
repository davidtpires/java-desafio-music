package br.com.alura.java_desafio_music.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterBiografia(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));
//        System.out.println("Key: " + System.getenv("OPENAI_APIKEY"));

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("Forneça uma breve descrição (máximo duas frases) do artista : metallica : " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
