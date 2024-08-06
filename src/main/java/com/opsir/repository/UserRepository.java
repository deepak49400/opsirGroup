package com.opsir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opsir.entity.Student;
import com.opsir.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
