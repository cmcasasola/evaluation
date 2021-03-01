package pe.com.personalevaluation.evaluation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.personalevaluation.evaluation.entity.Computer;

public interface ComputerRepository extends ReactiveCrudRepository<Computer, String> {
}
