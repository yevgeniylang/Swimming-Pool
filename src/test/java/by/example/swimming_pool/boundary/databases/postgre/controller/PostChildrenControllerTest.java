package by.example.swimming_pool.boundary.databases.postgre.controller;

import by.example.swimming_pool.RequestService;
import by.example.swimming_pool.boundary.databases.postgre.models.dto.ChildrenDto;
import by.example.swimming_pool.boundary.databases.postgre.repositories.ChildrenRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostChildrenControllerTest extends RequestService {

    @Autowired
    ChildrenRepository childrenRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        this.childrenRepository.deleteAll();
    }

    @Test
    @DisplayName("Successful post children")
    void SuccessfulPost() throws JsonProcessingException {

        ChildrenDto childrenDto = new ChildrenDto("Konstantin", 1995,"10.15,36");

        String json = objectMapper.writeValueAsString(childrenDto);

        ResponseEntity<String> responseEntity = this.postNoAuth(json, String.class);
        assertNotNull(responseEntity.getBody());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Override
    public String getPath() {
        return "/post";
    }
}
