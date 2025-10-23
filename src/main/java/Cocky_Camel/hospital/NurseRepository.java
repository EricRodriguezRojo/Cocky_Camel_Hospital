package Cocky_Camel.hospital;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Integer> {
    Nurse findByNameIgnoreCase(String name);
    Nurse findByUserIgnoreCase(String user); // Para el log in ya que se necesita el user no el name.
}