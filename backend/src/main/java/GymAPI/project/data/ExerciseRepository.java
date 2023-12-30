package GymAPI.project.data;

import GymAPI.project.Exercise;

import java.util.List;

public interface ExerciseRepository {

    List<Exercise> findExercises(String muscle, String equipment);

}
