package max.code.mySpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
	}

	@GetMapping
	public String helloWorld(){
		return "Hello World via Spring Boot";
	}

}
