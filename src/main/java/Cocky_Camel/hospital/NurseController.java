package Cocky_Camel.hospital;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

	public NurseController() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			InputStream is = new ClassPathResource("static/nurses.json").getInputStream();
			nurses = mapper.readValue(is, new TypeReference<List<Nurse>>() {
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/nurse/index")
	public ResponseEntity<List<Nurse>> getAll() {
		return ResponseEntity.ok(nurses);
	}
}
