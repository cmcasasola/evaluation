package pe.com.personalevaluation.evaluation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("typewriters")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Typewriter extends Machine {
    private String material;
}
