package com.webservices.restfulwebservice.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserResources {

    private UserDaoService service;
    public UserResources(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> reterieveAllUser() {
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User reterieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

}
