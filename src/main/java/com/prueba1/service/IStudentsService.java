
package com.prueba1.service;
import java.util.List;
import com.prueba1.entities.Students;

public interface IStudentsService {
    List<Students> getAllStudents();
    void save(Students students);

    void delete(Students students);
}
