package com.helpdesk_management.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk_management.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);
}