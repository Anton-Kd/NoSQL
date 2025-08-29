package ru.netology.nosql_mongodb;

import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String id;
    @NotBlank
    private String name;
    private String email;
    @NotBlank
    private Integer age;
//    Определите сущность User, которая будет храниться в коллекции MongoDB.
//    Эта сущность должна содержать поля id, name, email и age.
//    Используйте аннотации MongoDB (@Document, @Id) для правильной разметки модели.
}
