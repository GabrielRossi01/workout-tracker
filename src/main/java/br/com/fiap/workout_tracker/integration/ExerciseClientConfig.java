package br.com.fiap.workout_tracker.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ExerciseClientConfig {

    @Value("${api.ninjas.key}")
    private String apiKey;

    @Bean
    public ExerciseClient exerciseClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("https://api.api-ninjas.com/v1")
                .defaultHeader("X-Api-Key", apiKey)
                .build();

        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(ExerciseClient.class);
    }
}
