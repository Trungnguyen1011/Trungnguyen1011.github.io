package jpa.test.sn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"jpa.test.sn"})
public class SnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnApplication.class, args);
	}

}
