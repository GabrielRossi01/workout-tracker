package br.com.fiap.workout_tracker.integration;

import br.com.fiap.workout_tracker.dto.ExerciseResponse;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface ExerciseClient {

    @GetExchange("/exercises")
    List<ExerciseResponse> getExercisesByTarget(@RequestParam("muscle") String muscle);

    @GetExchange("/exercises")
    List<ExerciseResponse> getExercisesByName(@RequestParam("name") String name);
}
