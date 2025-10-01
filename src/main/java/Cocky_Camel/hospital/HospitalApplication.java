package Cocky_Camel.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {

	List<Nurse> nurses = new ArrayList<>();

	public static void main(String[] args) {
		nurses.add(new Nurse("Dolores Curitas"));
		nurses.add(new Nurse("Ana Sanguina"));
		nurses.add(new Nurse("Clara U. Estresada"));
		nurses.add(new Nurse("Enfermera McStitch"));
		nurses.add(new Nurse("Beti Bandaid"));
		nurses.add(new Nurse("Inyecciones Joy"));
		nurses.add(new Nurse("Marga Rina"));
		nurses.add(new Nurse("Salud P. Rápida"));
	}

}
