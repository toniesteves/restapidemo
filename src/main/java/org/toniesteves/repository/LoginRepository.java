package org.toniesteves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toniesteves.model.security.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsername(String username);
}
