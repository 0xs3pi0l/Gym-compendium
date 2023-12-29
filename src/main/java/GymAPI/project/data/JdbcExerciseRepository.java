package GymAPI.project.data;

import GymAPI.project.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcExerciseRepository implements ExerciseRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcExerciseRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Exercise findExercise(String muscle, String equipment){

        List<Exercise> exercise = jdbcTemplate.query(
                "select id, name, muscle, equipment, link from exercises where muscle=? and equipment=?",
                this::mapRowtoExercise,
                muscle, equipment
        );

        if(exercise.size() == 0){
            return new Exercise(null, null, null, null, null);
        } else {
            return exercise.get(0);
        }
    }

    public List<Exercise> mapRowtoExercise(ResultSet row) throws SQLException {
        List exercises = new ArrayList();
        exercises.add(
                new Exercise(
                        row.getInt("id"),
                        row.getString("name"),
                        row.getString("muscle"),
                        row.getString("equipment"),
                        row.getString("link")
                ));

        return exercises;
    };
}
