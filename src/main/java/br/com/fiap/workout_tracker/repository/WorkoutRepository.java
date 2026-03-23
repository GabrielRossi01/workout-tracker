package br.com.fiap.workout_tracker.repository;

import br.com.fiap.workout_tracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
