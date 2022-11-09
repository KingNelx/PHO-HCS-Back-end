package backend.Repository;

import backend.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DoctorRepo extends JpaRepository <Doctor, Long> {
}
