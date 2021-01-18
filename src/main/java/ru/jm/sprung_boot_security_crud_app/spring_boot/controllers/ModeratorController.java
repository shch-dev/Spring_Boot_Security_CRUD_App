package ru.jm.sprung_boot_security_crud_app.spring_boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.jm.sprung_boot_security_crud_app.spring_boot.service.UserService;

@Controller
public class ModeratorController {

    private final UserService userService;

    @Autowired
    public ModeratorController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/moderator")
    public String index(Model model) {
        model.addAttribute("AllUsers", userService.getAllUsers());
        return "moderator/allUsers";
    }
}
