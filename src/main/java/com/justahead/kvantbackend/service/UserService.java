package com.justahead.kvantbackend.service;

import com.justahead.kvantbackend.model.User;
import com.justahead.kvantbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    private final com.justahead.kvantbackend.repository.UserRepository UserRepository;

    public UserService(UserRepository UserRepository) {//внедили зависимость
        this.UserRepository = UserRepository;
    }

    @Autowired
    private UserRepository userRepository;


    public void create(User user) {
        userRepository.save(user);
    }


    public User findByUsername(String username){
        return UserRepository.findByUsername(username);
    }

    public boolean existByUsername(String username){return UserRepository.existsByUsername(username);}


    public boolean delete(User user) {
        return UserRepository.deleteByUsername(user.getUsername());
    }


    public String read(User user) {
        return null;
    }


    public List<User> readAll() {
        return userRepository.findAll();
    }


    public User read(int id) {
        return userRepository.getOne(id);
    }






    public boolean delete(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }



    public boolean update(User user, String username) {
        if (userRepository.existsByUsername(username)) {
            user.setUsername(username);
            userRepository.save(user);
            return true;
        }

        return false;
    }


}
