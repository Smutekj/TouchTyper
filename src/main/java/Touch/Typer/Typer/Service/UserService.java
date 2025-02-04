package Touch.Typer.Typer.Service;

import Touch.Typer.Typer.Model.User;
import Touch.Typer.Typer.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;


    public List<User> getAllProducts() {
        return repo.findAll();
    }
    public void add(User user) {
        repo.save(user);
    }

    public boolean getUserByName(String username) {
        return repo.findByUsername(username);
    }
}