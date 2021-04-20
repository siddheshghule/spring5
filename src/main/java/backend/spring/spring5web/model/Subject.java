package backend.spring.spring5web.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Name;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

    public Subject() {

    }

    public Subject(long id, String name, Set<Student> students) {
        this.id = id;
        Name = name;
        this.students = students;
    }


    public Subject(long id, String name) {
        this.id = id;
        Name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", students=" + students +
                '}';
    }
}
