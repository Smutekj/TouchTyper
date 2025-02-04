package Touch.Typer.Typer.repo;

import Touch.Typer.Typer.Model.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepo extends JpaRepository<Sentence, Integer> {
}