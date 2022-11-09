package backend.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PHOAdmin")

public class Admin {
    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String role;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
}
