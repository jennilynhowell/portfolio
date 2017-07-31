package com.jennilyn.repositories;

import com.jennilyn.interfaces.ProjectRepository;
import com.jennilyn.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Project> findAll(){
        return jdbcTemplate.query("SELECT * FROM project", new ProjectMapper());
    }

    @Override
    public void delete(long id) {
        jdbcTemplate.update("DELETE FROM project WHERE id = ?", id);
    }

    private static class ProjectMapper implements RowMapper<Project> {
        @Override
        public Project mapRow(ResultSet resultSet, int i) throws SQLException {
            Project project = new Project(resultSet.getInt("id"),
                    resultSet.getString("title"),
                    resultSet.getString("subheader"),
                    resultSet.getString("description"),
                    resultSet.getString("gitUrl"),
                    resultSet.getString("liveUrl"),
                    resultSet.getString("monthCreated"),
                    resultSet.getString("category"),
                    resultSet.getString("thumbnailUrl"),
                    resultSet.getString("largeUrl"));
            return project;
        }
    }

}
