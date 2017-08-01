package com.jennilyn.controllers;

import com.jennilyn.models.Project;
import com.jennilyn.repositories.ProjectRepositoryImpl;
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
    private ProjectRepositoryImpl repo;

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

    @RequestMapping(value = "/createItem", method = RequestMethod.POST)
    public String createItem(@RequestParam("title") String title,
                             @RequestParam("subheader") String subheader,
                             @RequestParam("description") String description,
                             @RequestParam("monthCreated") String monthCreated,
                             @RequestParam("category") String category,
                             @RequestParam("gitUrl") String gitUrl,
                             @RequestParam("liveUrl") String liveUrl,
                             @RequestParam("thumbnailUrl") String thumbnailUrl,
                             @RequestParam("largeUrl") String largeUrl) {
        repo.add(title, subheader, description, monthCreated, category, gitUrl, liveUrl, thumbnailUrl, largeUrl);

        return "redirect:/admin";
    }

    @RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
    public String deleteItem(@RequestParam("id") long id) {
        repo.delete(id);
        return "redirect:/admin";
    }
}
