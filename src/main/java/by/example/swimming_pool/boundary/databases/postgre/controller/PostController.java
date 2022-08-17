package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.boundary.databases.postgre.models.converters.ChildrenModelToDtoConverter;
import by.example.swimming_pool.boundary.databases.postgre.models.dto.ChildrenDto;
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
    ChildrenModelToDtoConverter converter;

    @PostMapping(value = "/post")
    public ResponseEntity<Object> post(@RequestBody ChildrenDto childrenDto){

        Children children = this.converter.convert(childrenDto);

        Children result = this.childrenRepository.save(children);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }
}
