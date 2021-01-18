package ru.jm.sprung_boot_security_crud_app.spring_boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.jm.sprung_boot_security_crud_app.spring_boot.models.User;
import ru.jm.sprung_boot_security_crud_app.spring_boot.service.UserService;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user/{id}")
    public String helloUser(Model model, @PathVariable("id") int id) {

        User currentUser = (User) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        if (currentUser.getId() != id && currentUser.getRoles().stream().noneMatch((x -> x.getName().contains("ROLE_ADMIN")))) {
            return "redirect:/user/" + currentUser.getId();
        }
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/user";
    }
}
