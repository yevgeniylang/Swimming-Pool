package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class DeleteController {

    ChildrenRepository childrenRepository;

    @DeleteMapping(value = "/delete/{Id}")
    public void delete(@PathVariable Long Id){
        this.childrenRepository.deleteById(Id);
    }
}
