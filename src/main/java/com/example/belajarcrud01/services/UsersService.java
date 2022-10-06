package com.example.belajarcrud01.services;

import com.example.belajarcrud01.models.UsersModel;
import com.example.belajarcrud01.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
this.userRepository = userRepository;
    }

    public UsersModel registerUser(String login, String password, String email){
        if (login == null || password == null){
            return null;
        } else {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return userRepository.save(usersModel);
        }
    }
    public UsersModel authenticated(String login, String password){
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
