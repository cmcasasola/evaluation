package pe.com.personalevaluation.evaluation.service.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ComputerDto.class, name = "COMPUTER"),
        @JsonSubTypes.Type(value = NotebookDto.class, name = "NOTEBOOK"),
        @JsonSubTypes.Type(value = TypewriterDto.class, name = "TYPEWRITER")
})
@NoArgsConstructor
@AllArgsConstructor
public class MachineDto {
    private String mark;
    private String model;
    private String year;
    private String colour;
    private MachineType type;
}
