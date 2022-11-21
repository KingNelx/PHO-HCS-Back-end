package backend.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Patients")
public class Patient {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;

    // client profile

    private @Getter @Setter String lastName;
    private @Getter @Setter String firstName;
    private @Getter @Setter String middleName;

    @Column(length = 12)
    private @Getter @Setter String philHealthNo;
    private @Getter @Setter String sex;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private @Getter @Setter Date dateOfBirth;
    private @Getter @Setter String clientType;


    // past medical history

    private @Getter @Setter boolean hasAllergy;
    private @Getter @Setter boolean hasAsthma;
    private @Getter @Setter boolean hasCancer;
    private @Getter @Setter boolean hasCerebrovascularDisease;
    private @Getter @Setter boolean hasCoronaryArteryDisease;
    private @Getter @Setter boolean hasDiabetes;
    private @Getter @Setter boolean emphysema;
    private @Getter @Setter boolean hasEpilepsy;
    private @Getter @Setter boolean hasHepatitis;
    private @Getter @Setter boolean hasHyperlipidemia;
    private @Getter @Setter boolean hasHypertension;
    private @Getter @Setter boolean hasPepticUlcer;
    private @Getter @Setter boolean hasPneumonia;
    private @Getter @Setter boolean hasThyroidDisease;
    private @Getter @Setter boolean hasPulmonaryTuberculosis;
    private @Getter @Setter boolean hasExtraPulmonaryTuberculosis;
    private @Getter @Setter boolean urinaryTractInfection;
    private @Getter @Setter boolean hasMentalIllness;
    private @Getter @Setter String otherConcerns;

    // family and past medical history entity is the same
    

}
