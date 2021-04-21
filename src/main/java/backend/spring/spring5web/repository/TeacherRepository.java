package backend.spring.spring5web.repository;

import backend.spring.spring5web.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
