package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
//@RequiredArgsConstructor
//@NoArgsConstructor
public class Movie {
    @Id
    private Integer id;
    private String title;

    public Movie() {
    }

    public Movie(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
}
