package mansar.com.flatmate.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity(name = "user")
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
