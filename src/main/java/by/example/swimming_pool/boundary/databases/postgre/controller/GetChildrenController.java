package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class GetChildrenController {

    ChildrenRepository childrenRepository;

    @GetMapping(value = "/get")
    public List<Children> get() {
        List<Children> list = this.childrenRepository.findAll();
        return list;
    }

    @GetMapping("/")
    public String list(Model model) {
        return "index.html";
    }
}
