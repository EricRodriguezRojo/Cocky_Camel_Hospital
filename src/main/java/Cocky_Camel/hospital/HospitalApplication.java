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
	public static List<Nurse> nurses = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
		Nurse nurse1 = new Nurse("Pepe", "rodri", "123");
		Nurse nurse2 = new Nurse("Mario", "lopez", "333");
		Nurse nurse3 = new Nurse("Felipe", "cast", "321");

		nurses.add(nurse1);
		nurses.add(nurse2);
		nurses.add(nurse3);

	}

	@GetMapping("/nurse/prueba/{prueba}")
	public String nurse(@PathVariable String prueba) {
		return String.format("Hello %s!", prueba);
	}
}