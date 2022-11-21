package backend.Controller;

import backend.Model.Patient;
import backend.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/rhu")
@CrossOrigin("http://localhost:3000/")
public class RHUController {

    @Autowired
    private PatientRepo patientRepo;

    @PostMapping("/addPatient")
    Patient addpatient(@RequestBody Patient addPatient){
        return patientRepo.save(addPatient);
    }

    @GetMapping("/getAllPatients")
    List<Patient> getAllPatients(){
        return patientRepo.findAll();
    }

    @GetMapping("/patientsFromSanMiguel")
    List<String> patientsFromSanMiguel(){
        return patientRepo.patientsFromSanMiguel();
    }

    @GetMapping("/patientsFromSanAndres")
    List<String> patientsFromSanAndres(){
        return patientRepo.patientsFromSanAndres();
    }

    @GetMapping("/patientsFromPandan")
    List<String> patientsFromPandan(){
        return patientRepo.patientsFromPandan();
    }

    @GetMapping("/patientsFromBato")
    List<String> patientsFromBato(){
        return patientRepo.patientsFromBato();
    }

    @GetMapping("/patientsFromCaramoran")
    List<String> patientsFromCaramoran(){
        return patientRepo.patientsFromCaramoran();
    }

    @GetMapping("/patientsFromSogodSimamla")
    List<String> patientsFromSogodSimamla(){
        return patientRepo.patientsFromSogodSimamla();
    }
}
