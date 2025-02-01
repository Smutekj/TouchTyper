package Touch.Typer.Typer.Controller;
import Touch.Typer.Typer.Model.Word;
import Touch.Typer.Typer.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WordCon {

    @Autowired
    private WordService service;

    @GetMapping("/test")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Word> getAllProducts(){
        return service.getAllProducts();
    }
}
