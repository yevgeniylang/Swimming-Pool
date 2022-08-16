package by.example.swimming_pool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SwimmingPoolApplicationTests {

	@Test
	void contextLoads() {
	}

}
