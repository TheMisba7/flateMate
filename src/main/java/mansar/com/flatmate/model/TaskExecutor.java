package mansar.com.flatmate.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity(name = "taskExecutor")
@NoArgsConstructor
@Setter
@Getter
public class TaskExecutor {
    @Id
    private Long id;
    private User executor;
    private int spentTime;
    private Double fees;
    private String comment;
}
