package ru.netology.nosql_mongodb.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.nosql_mongodb.model.User;
import ru.netology.nosql_mongodb.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getName")
    public User getUser(@RequestParam String name) {
        return userService.getUserName(name);
    }

    @GetMapping("/getAge")
    public User getUser(@RequestParam int age) {
        return userService.getUserAge(age);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestParam String name, int age) {
        userService.getUserName(name);
        userService.updateUser(name, age);
        return userService.getUserName(name);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        ResponseEntity<String> userDelete = ResponseEntity.ok(userService.getUser(id) + "DELETED");
        userService.deleteUser(id);
        return userDelete;
    }
}
