package ru.netology.nosql_mongodb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import ru.netology.nosql_mongodb.errors.ErrorDelete;
import ru.netology.nosql_mongodb.errors.SearchError;
import ru.netology.nosql_mongodb.model.User;
import ru.netology.nosql_mongodb.repository.UserRepository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final MongoTemplate mongoTemplate;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserName(String name) {
        if (userRepository.findByName(name) == null) {
            throw new SearchError("user: " + name + " no registered");
        }
        return userRepository.findByName(name);
    }

    public User getUserAge(int age) {
        if (userRepository.findByAge(age) == null) {
            throw new SearchError("user of: " + age + " no registered");
        }
        return userRepository.findByAge(age);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(String name, int age) {
        Update update = new Update()
                .set("age", age);
        mongoTemplate.updateFirst(query(where("name").is(name)), update, User.class);
    }


    public void deleteUser(String id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new ErrorDelete("Error id");
        }
        userRepository.deleteById(id);
    }


}
