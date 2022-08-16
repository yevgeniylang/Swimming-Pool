package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class GetChildrenController {

    ChildrenRepository childrenRepository;

    @GetMapping(value = "/getall")
    public List<Children> get() {
        Children children = new Children("Uljana", 10L);
        List<Children> list = this.childrenRepository.findAll();
        return list;
    }
}
