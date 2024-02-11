package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Client;
import com.app.entities.user.User;

@Repository
public interface ClientDao extends JpaRepository<Client, Integer>{

	Client findByEmailAndPassword(String email, String password);

	Client findByEmail(String email);

}
