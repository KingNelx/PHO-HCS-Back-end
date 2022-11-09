package backend.Repository;

import backend.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface AdminRepo extends JpaRepository<Admin, Long > {
}
