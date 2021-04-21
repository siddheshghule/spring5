package backend.spring.spring5web.repository;

import backend.spring.spring5web.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
