package Touch.Typer.Typer.repo;

import Touch.Typer.Typer.Model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepo extends JpaRepository<Word, Integer> {
}