package Touch.Typer.Typer.Controller;
import Touch.Typer.Typer.Model.User;
import Touch.Typer.Typer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserCon {

    @Autowired
    private UserService service;

    @GetMapping("/addUser/{username}")
    @CrossOrigin(origins = "http://localhost:5173")
    public boolean getUserByName(@PathVariable String username) {
        return service.getUserByName(username);
    }

    @PostMapping("/addUser")
    @CrossOrigin(origins = "http://localhost:5173")
    public void addUser(@RequestBody User user){
        service.add(user);
    }
}
