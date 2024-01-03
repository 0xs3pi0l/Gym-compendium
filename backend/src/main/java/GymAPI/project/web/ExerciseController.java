package GymAPI.project.web;

import GymAPI.project.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import GymAPI.project.data.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping
public class ExerciseController {

    JdbcExerciseRepository jdbcExerciseRepository;

    @Autowired
    ExerciseController(JdbcExerciseRepository jdbcExerciseRepository){
        this.jdbcExerciseRepository = jdbcExerciseRepository;
    }

    @GetMapping("/exercise")
    public List<Exercise> getExercise(@RequestParam(name = "muscle") String muscle,
                                      @RequestParam(name = "equipment") String equipment){

        return jdbcExerciseRepository.findExercises(muscle, equipment);
    }
}
