package ru.jm.sprung_boot_security_crud_app.spring_boot.service;


import ru.jm.sprung_boot_security_crud_app.spring_boot.models.Role;
import ru.jm.sprung_boot_security_crud_app.spring_boot.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void removeUser(int id);

    public void updateUser(int id, User user);

    public User getUser(int id);

    public List<Role> getRoles();


}
