package com.nitin.nitin_social_app.controller;

import com.nitin.nitin_social_app.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();

        User user1 = new User(1,"nitin","thakur","nitinthakur@gmail.com","1234");
        User user2 = new User(2,"ram","arora","ramarora@gmail.com","1234");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }


    @GetMapping("/users/{userId}")
    public User getUsersById(@PathVariable("userId") Integer id){

        User user1 = new User(1,"code","nitin","codenitin@gmail.com","1234");
        user1.setId(id);
        return user1;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setId(user.getId());
        newUser.setFirstName(user.getFirstName());
        newUser.setPassword(user.getPassword());
        newUser.setLastName(user.getLastName());
        return newUser;
    }


    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        User user1 = new User(1,"code","nitin","codenitin@gmail.com","1234");
        if(user.getFirstName() != null){
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName() != null){
            user1.setLastName(user.getLastName());
        }
        if(user.getEmail() != null){
            user1.setEmail(user.getEmail());
        }

        return user1;
    }


    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId){
        return "user deleted successfully "+userId;
    }



}






















