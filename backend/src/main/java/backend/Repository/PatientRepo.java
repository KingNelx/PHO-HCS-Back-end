package backend.Repository;

import backend.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Long> {

    @Query("SELECT * FROM Patient Patients WHERE RHU = SanMiguel")
    List<String> patientsFromSanMiguel();

    @Query("SELECT * FROM Patient Patients WHERE RHU = SanAndres")
    List<String> patientsFromSanAndres();

    @Query("SELECT * FROM Patient Patients WHERE RHU = Pandan")
    List<String> patientsFromPandan();

    @Query("SELECT * FROM Patient Patients WHERE RHU = Bato")
    List<String> patientsFromBato();

    @Query("SELECT * FROM Patient Patients WHERE RHU = Caramoran")
    List<String> patientsFromCaramoran();

    @Query("SELECT * FROM Patient Patients WHERE RHU = SogodSimamla")
    List<String> patientsFromSogodSimamla();

}
