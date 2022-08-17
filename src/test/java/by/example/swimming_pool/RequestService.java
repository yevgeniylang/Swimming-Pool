package by.example.swimming_pool;

import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

public abstract class RequestService extends SwimmingPoolApplicationTests {

    @Autowired
    TestRestTemplate testRestTemplate;

    public <T> ResponseEntity<T> get(Class<T> tClass) {

        return testRestTemplate.getForEntity(this.getPath(), tClass);
    }

    public <T> ResponseEntity<T> getList(Class<T> tClass) {
        return testRestTemplate.exchange(this.getPath(), HttpMethod.GET, null, new ParameterizedTypeReference<T>() {
        }, tClass);
    }

    public <T> ResponseEntity<T> postNoAuth(String payload, Class<T> tClass) {

        HttpHeaders headers = getHeaderWithoutAuthentication();
        HttpEntity<String> entity = new HttpEntity<>(payload, headers);

        return this.testRestTemplate.postForEntity(this.getPath(), entity, tClass);
    }

    private HttpHeaders getHeaderWithoutAuthentication() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }

    public abstract String getPath();
}
