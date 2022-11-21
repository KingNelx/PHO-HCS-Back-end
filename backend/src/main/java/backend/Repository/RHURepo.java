package backend.Repository;

import backend.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RHURepo extends JpaRepository<Patient, Long> {
}
