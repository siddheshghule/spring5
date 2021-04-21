package backend.spring.spring5web.repository;

import backend.spring.spring5web.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
