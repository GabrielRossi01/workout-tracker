package br.com.fiap.workout_tracker.controller;

import br.com.fiap.workout_tracker.dto.ExerciseResponse;
import br.com.fiap.workout_tracker.integration.ExerciseClient;
import br.com.fiap.workout_tracker.repository.WorkoutRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutRepository repository;
    private final ExerciseClient exerciseClient;

    public WorkoutController(WorkoutRepository repository, ExerciseClient exerciseClient) {
        this.repository = repository;
        this.exerciseClient = exerciseClient;
    }

    @GetMapping("/exercises/muscle/{muscle}")
    public ResponseEntity<List<ExerciseResponse>> getExercisesByMuscle(@PathVariable String muscle) {
        List<ExerciseResponse> exercises = exerciseClient.getExercisesByTarget(muscle);

        return ResponseEntity.ok(exercises);
    }
}
