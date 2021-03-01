package pe.com.personalevaluation.evaluation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.MachineType;
import pe.com.personalevaluation.evaluation.service.impl.ComputerService;
import pe.com.personalevaluation.evaluation.service.impl.NotebookService;
import pe.com.personalevaluation.evaluation.service.impl.TypewriterService;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class EvaluationConfig {

    @Bean
    public Map<MachineType, MachineService> map(ComputerService computerService, NotebookService notebookService,
                                                TypewriterService typewriterService) {
        Map<MachineType, MachineService> machineServicesBytType = new HashMap<>();
        machineServicesBytType.put(MachineType.COMPUTER, computerService);
        machineServicesBytType.put(MachineType.NOTEBOOK, notebookService);
        machineServicesBytType.put(MachineType.TYPEWRITER, typewriterService);

        return machineServicesBytType;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build();
    }
}
