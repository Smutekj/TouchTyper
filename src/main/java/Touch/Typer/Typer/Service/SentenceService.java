package Touch.Typer.Typer.Service;

import Touch.Typer.Typer.Model.Sentence;
import Touch.Typer.Typer.repo.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentenceService {

    @Autowired
    private SentenceRepo repo;


    public List<Sentence> getAllProducts() {
        return repo.findAll();
    }
}