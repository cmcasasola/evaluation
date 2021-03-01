package pe.com.personalevaluation.evaluation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.personalevaluation.evaluation.entity.Typewriter;

public interface TypewriterRepository extends ReactiveCrudRepository<Typewriter, String> {
}
