package Cocky_Camel.hospital;

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
