package backend.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Table(name="Patients")
@Entity
public class Patient {

    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Setter @Getter String lastName;
    private @Getter @Setter String address;
    private @Getter @Setter int age;
    private @Getter @Setter String contactNumber;
    private @Getter @Setter String patientType;
}
