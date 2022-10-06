package com.example.belajarcrud01.repositories;

import com.example.belajarcrud01.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByLoginAndPassword(String login, String password);

}
