package ru.netology.nosql_mongodb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.netology.nosql_mongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);

    User findByAge(int age);
}
