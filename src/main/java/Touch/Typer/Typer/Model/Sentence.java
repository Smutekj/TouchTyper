package Touch.Typer.Typer.Model;

import jakarta.persistence.*;

@Entity
public class Sentence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sentence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String word) {
        this.sentence = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", word='" + sentence + '\'' +
                '}';
    }
}
