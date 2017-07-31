package com.jennilyn.interfaces;

import com.jennilyn.models.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProjectRepository {

    List<Project> findAll();
    void delete(long id);
    void add(String title, String subheader, String description, String monthCreated, String category, String gitUrl, String liveUrl, String thumbnailUrl, String largeUrl);

}
