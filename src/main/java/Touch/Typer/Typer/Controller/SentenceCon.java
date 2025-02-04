package Touch.Typer.Typer.Controller;
import Touch.Typer.Typer.Model.Sentence;
import Touch.Typer.Typer.Service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SentenceCon {

    @Autowired
    private SentenceService service;

    @GetMapping("/sentence")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Sentence> getAllProducts(){
        return service.getAllProducts();
    }
}
