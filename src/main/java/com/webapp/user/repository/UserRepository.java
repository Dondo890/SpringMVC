package com.webapp.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findUserByUsername(String username);
	User findUserByuuid(UUID uuid);
	
}
