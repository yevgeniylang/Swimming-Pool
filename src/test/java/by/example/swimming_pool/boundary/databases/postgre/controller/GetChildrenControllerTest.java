package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.RequestService;
import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class GetChildrenControllerTest extends RequestService {

    @Autowired
    ChildrenRepository childrenRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    Long id;
    Children children;

    @BeforeEach
    void setUp() {
        /*children = new Children("Eugen",15L);
        this.childrenRepository.save(children);
        id = children.getId();*/
    }

    @AfterEach
    void tearDown() {
        //this.childrenRepository.deleteAll();
    }

    @Test
    void get() {

        ResponseEntity<Children> responseEntity = this.get(Children.class);
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK.value(), responseEntity.getStatusCodeValue());
    }

    @Override
    public String getPath() {
        return "/get";
    }
}