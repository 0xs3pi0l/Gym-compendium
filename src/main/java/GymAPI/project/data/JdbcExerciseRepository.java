package GymAPI.project.data;

import GymAPI.project.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcExerciseRepository implements ExerciseRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcExerciseRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Exercise> findExercises(String muscle, String equipment){

        List<Exercise> exercises = jdbcTemplate.query(
                "select id, name, muscle, equipment, link from exercises where muscle=? and equipment=?",
                this::mapRowtoExercise,
                muscle, equipment
        );

        return exercises;
    }

    public Exercise mapRowtoExercise(ResultSet row, int RowNum) throws SQLException {
        return(new Exercise(
                row.getInt("id"),
                row.getString("name"),
                row.getString("muscle"),
                row.getString("equipment"),
                row.getString("link")
        ));
    }
}
