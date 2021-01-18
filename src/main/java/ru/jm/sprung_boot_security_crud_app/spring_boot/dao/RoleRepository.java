package ru.jm.sprung_boot_security_crud_app.spring_boot.dao;

import org.springframework.data.repository.CrudRepository;
import ru.jm.sprung_boot_security_crud_app.spring_boot.models.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

}
