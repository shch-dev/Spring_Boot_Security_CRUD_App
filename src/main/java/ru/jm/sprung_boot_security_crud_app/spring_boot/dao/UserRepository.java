package ru.jm.sprung_boot_security_crud_app.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jm.sprung_boot_security_crud_app.spring_boot.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User getUserByUsername(String username);

}
