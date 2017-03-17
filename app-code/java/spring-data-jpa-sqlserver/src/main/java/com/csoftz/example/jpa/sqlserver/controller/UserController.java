package com.csoftz.example.jpa.sqlserver.controller;

import com.csoftz.example.jpa.sqlserver.User;
import com.csoftz.example.jpa.sqlserver.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserRepository repository;

    public UserController(final UserRepository userRepository) {
        this.repository = userRepository;
    }

    @GetMapping("/save")
    public void save() {
        User user = new User("User info", 48);
        repository.save(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id) {
        User user = null;
        if (repository.exists(id)) {
             user = repository.findOne(id);
            user.setAge(user.getAge() + 1);
            repository.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new User(), HttpStatus.NOT_ACCEPTABLE);
    }

    @GetMapping()
    public Iterable<User> getAll() {
        return repository.findAll();
    }
}
