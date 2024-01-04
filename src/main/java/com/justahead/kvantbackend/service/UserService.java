package com.justahead.kvantbackend.service;

import com.justahead.kvantbackend.model.User;
import com.justahead.kvantbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService{



    @Autowired
    private UserRepository userRepository;


    public void create(User user) {
        userRepository.save(user);
    }


    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public boolean existByUsername(String username){return userRepository.existsByUsername(username);}


    public boolean delete(User user) {
        return userRepository.deleteByUsername(user.getUsername());
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
