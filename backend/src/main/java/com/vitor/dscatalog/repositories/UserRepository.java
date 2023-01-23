package com.vitor.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByEmail(String email);
	
}
