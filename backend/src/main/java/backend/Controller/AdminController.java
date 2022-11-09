package backend.Controller;


import backend.Model.Admin;
import backend.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminController {

    @Autowired
    private AdminRepo adminRepo;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin addAdmin){
        return adminRepo.save(addAdmin);
    }

    @GetMapping("/getAdmin")
    List<Admin> getAdmin(){
        return adminRepo.findAll();
    }
}
