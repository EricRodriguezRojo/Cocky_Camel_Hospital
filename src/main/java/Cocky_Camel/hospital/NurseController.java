package Cocky_Camel.hospital;
import java.util.ArrayList;
import java.util.List;

public class NurseController {
	private List<Nurse> nurses = new ArrayList<>();	
	
	public void Nurses() {
		Nurse nurse1 = new Nurse("Pepe", "rodri", "123");
		Nurse nurse2 = new Nurse("Mario", "lopez", "333");
		Nurse nurse3 = new Nurse("Felipe", "cast", "321");
		nurses.add(nurse1);
		nurses.add(nurse2);
		nurses.add(nurse3);
	}
	
}
