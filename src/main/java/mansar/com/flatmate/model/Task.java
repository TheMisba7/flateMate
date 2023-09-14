package mansar.com.flatmate.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Map;

@Entity(name = "task")
@NoArgsConstructor
@Setter
@Getter
public class Task {

    @Id
    private Long id;
    private String type;
    /**
     * in minutes.
     */
    private int estimatedTime;
    private LocalDateTime startDate;
    private Map<String, User> participants;
    private IntervalUnit intervalUnit;

    private String description;
}
