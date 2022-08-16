package by.example.swimming_pool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public abstract class RequestService extends SwimmingPoolApplicationTests {

    @Autowired
    TestRestTemplate testRestTemplate;

    public <T> ResponseEntity<T> get(Class<T> tClass) {

        return testRestTemplate.getForEntity(this.getPath(), tClass);
    }

    private HttpHeaders getHeaderWithoutAuthentication() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }

    public abstract String getPath();
}
