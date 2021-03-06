package pe.com.personalevaluation.evaluation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.personalevaluation.evaluation.entity.Notebook;

public interface NotebookRepository extends ReactiveCrudRepository<Notebook, String> {
}
