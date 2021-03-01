package pe.com.personalevaluation.evaluation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("notebooks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notebook extends Machine {
    private String processor;
    private String ram;
    private String size;
}
