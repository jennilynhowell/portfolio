package com.jennilyn.interfaces;

import com.jennilyn.models.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProjectRepository {

    List<Project> findAll();

}
