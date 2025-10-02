package Cocky_Camel.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class HospitalApplication {
	

	public static void main(String[] args) {
		

	}

	@GetMapping("/nurse/prueba/{prueba}")
	public String nurse(@PathVariable String prueba) {
		return String.format("Hello %s!", prueba);
	}
}