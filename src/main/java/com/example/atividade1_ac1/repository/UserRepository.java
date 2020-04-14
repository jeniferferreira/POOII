package com.example.atividade1_ac1.repository;

import java.util.HashMap;

import com.example.atividade1_ac1.model.User;

import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public class UserRepository {

    public HashMap<String, User> hm = new HashMap<String,User>();

    public UserRepository()
    {
        hm.put("john",new User("john","John da Silva","123"));
    }

    public User getUserByLogin(String login)
    {
        return hm.get(login);
    }

}