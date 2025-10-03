package Cocky_Camel.hospital;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NurseController {

	private List<Nurse> nurses = new ArrayList<>();

	@GetMapping("/nurse/name/{name}")
	public ResponseEntity<String> findByName(@PathVariable String name) {
		nurses.clear();
		nurses.add(new Nurse("Pepe", "rodri", "123"));
		nurses.add(new Nurse("Mario", "lopez", "333"));
		nurses.add(new Nurse("Felipe", "cast", "321"));

		for (Nurse nurse : nurses) {
			if (nurse.getName().equalsIgnoreCase(name)) {
				String response = "Enfermero encontrado: " + nurse.getName() + " | Usuario: " + nurse.getUser()
						+ " | Password: " + nurse.getPassword();
				return ResponseEntity.ok(response);
			}
		}

		return ResponseEntity.status(404).body("No se encontró ningún enfermero con el nombre: " + name);
	}

}
