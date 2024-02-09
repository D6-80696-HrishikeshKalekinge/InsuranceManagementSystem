package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.clients.Client;

@Repository
public interface UserDao extends JpaRepository<Client, Integer>{

	Client findByEmailAndPassword(String email, String password);

	Client findByEmail(String email);

}
