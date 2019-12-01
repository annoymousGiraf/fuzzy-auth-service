package local.auth.service.mockauthservice.controler;


import local.auth.service.mockauthservice.entity.User;
import local.auth.service.mockauthservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }



    @GetMapping(path = "user/{uname}")
    public User getUser(@PathVariable(name = "uname") String uname) {
        return userRepository.findUserByUname(uname);
    }


    @GetMapping(path = "user/{uname}/isactive")
    public Boolean isUserAuth(@PathVariable(name = "uname") String uname) {
        return userRepository.findUserByUname(uname).isActive();
    }

}
