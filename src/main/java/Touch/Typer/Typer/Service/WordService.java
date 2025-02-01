package Touch.Typer.Typer.Service;

import Touch.Typer.Typer.Model.Word;
import Touch.Typer.Typer.repo.WordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    private WordRepo repo;


    public List<Word> getAllProducts() {
        return repo.findAll();
    }
}
