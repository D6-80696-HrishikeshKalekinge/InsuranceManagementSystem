package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.users.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmailAndPassword(String email, String password);

	User findByEmail(String email);

}