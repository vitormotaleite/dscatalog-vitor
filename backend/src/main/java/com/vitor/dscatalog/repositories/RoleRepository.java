package com.vitor.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.dscatalog.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
