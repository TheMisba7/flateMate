package mansar.com.flatmate.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "flatMate")
@NoArgsConstructor
@Setter
@Getter
public class FlatMate {
    @Id
    private Long id;
    private User createdBy;
    private List<User> mates;
    @CreatedDate
    private LocalDateTime createdAt;
}
