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

    @ManyToMany(mappedBy = "subjects")
    private Set<Teacher> teacher = new HashSet<>();

    public Subject() {

    }

    public Subject(long id, String name, Set<Student> students, Set<Teacher> teacher) {
        this.id = id;
        Name = name;
        this.students = students;
        this.teacher = teacher;
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


    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id &&
                Objects.equals(Name, subject.Name) &&
                Objects.equals(students, subject.students) &&
                Objects.equals(teacher, subject.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, students, teacher);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }

}
