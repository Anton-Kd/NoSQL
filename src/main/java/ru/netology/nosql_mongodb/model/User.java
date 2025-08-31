package ru.netology.nosql_mongodb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private Integer age;

    @Override
    public String toString() {
        return "User:\n" +
                "id= " + id + "\n" +
                "name= " + name + "\n" +
                "email='" + email + "\n" +
                "age=" + age + "\n"
                ;
    }
    //    Определите сущность User, которая будет храниться в коллекции MongoDB.
//    Эта сущность должна содержать поля id, name, email и age.
//    Используйте аннотации MongoDB (@Document, @Id) для правильной разметки модели.
}
