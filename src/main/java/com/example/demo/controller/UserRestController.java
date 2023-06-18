package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UsersRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController

public class UserRestController {
    @Autowired
    UsersRepository usersRepository;

//    List<UserModel> userModels = new ArrayList<>(
//            Arrays.asList(
//                    new UserModel(UUID.randomUUID(), "Artem", "Developer", 33),
//                    new UserModel(UUID.randomUUID(), "Victor", "manager", 44)
//            )
//    );

    @GetMapping("users/getAllUsers")
    public List<UserModel> getAllUsers() {
        return (List<UserModel>) usersRepository.findAll();
    }

    @GetMapping("users/getUserById/{id}")
    public UserModel getUserById(@PathVariable UUID id) {
        return usersRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("users/createUser")
    public void createUser(@RequestBody @Valid UserModel user) {
//        user.setId(UUID.randomUUID());
        usersRepository.save(user);
//        return user.getId();
    }

    @DeleteMapping("users/deleteUserById/{id}")
    public void deletedUser(@PathVariable UUID id) {
        usersRepository.deleteById(id);
    }
//    @PutMapping("users/updateUserById/{uuid}")
//    public void updateUser(@PathVariable UUID uuid, @RequestBody @Valid UserModel user) {
//
//        int index;
//        for (index = 0; index != userModels.size() ; index++) {
//            if (userModels.get(index).getId().equals(uuid))
//                break;
//        }
//        user.setId(UUID.randomUUID());
//        userModels.set(index, user);
//    }
}
