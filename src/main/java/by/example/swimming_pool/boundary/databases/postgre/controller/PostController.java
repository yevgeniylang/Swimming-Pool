package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PostController {
    ChildrenRepository childrenRepository;

    @PostMapping(value = "/post")
    public ResponseEntity<Object> post(@RequestBody Children children){

        Children children1 = this.childrenRepository.save(children);

        return new ResponseEntity<>(children1, HttpStatus.OK);

    }
}
