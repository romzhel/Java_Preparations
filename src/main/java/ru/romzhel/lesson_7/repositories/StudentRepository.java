package ru.romzhel.lesson_7.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.romzhel.lesson_7.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
