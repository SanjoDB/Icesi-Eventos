package co.edu.icesieventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "co.edu.icesieventos.mongo.repository")
@SpringBootApplication
public class IcesiEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcesiEventosApplication.class, args);
	}

}