package Touch.Typer.Typer.repo;

import Touch.Typer.Typer.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    boolean findByUsername(String username);
}