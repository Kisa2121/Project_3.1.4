package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select u from User u left join fetch u.roles where u.name=:name")
    Role findRoleByName(String name);
}
