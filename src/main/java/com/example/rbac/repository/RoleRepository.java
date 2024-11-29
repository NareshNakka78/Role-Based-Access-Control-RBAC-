package com.example.rbac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rbac.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}


