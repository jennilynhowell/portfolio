package com.jennilyn.controllers;

import com.jennilyn.interfaces.ProjectRepository;
import com.jennilyn.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        List<Project> allProjects = repo.findAll();
        model.addAttribute("projects", allProjects);
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        List<Project> allProjects = repo.findAll();
        model.addAttribute("projects", allProjects);
        return "admin";
    }

    @RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
    public String deleteItem(@RequestParam("id") long id) {
        repo.delete(id);
        return "redirect:/admin";
    }
}
