package br.com.fiap.workout_tracker.dto;

public record ExerciseResponse(
        String name,
        String type,
        String muscle,
        String equipment,
        String difficulty,
        String instructions
) {}
