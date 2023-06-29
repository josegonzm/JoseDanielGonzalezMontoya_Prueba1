
package com.prueba1.service.impl;
import com.prueba1.db.IStudentsRepository;
import com.prueba1.entities.Students;
import com.prueba1.service.IStudentsService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentsService implements IStudentsService{
    private final IStudentsRepository studentsRepository;
    
    public StudentsService(IStudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }
    
    public List<Students> getAllStudents() {
        return (List<Students>) this.studentsRepository.findAll();
    }
    
    public void save(Students students) {
        students.setGenero("");
        this.studentsRepository.save(students);
    }
    
    public void delete(Students students) {
        this.studentsRepository.delete(students);
    }
    
}
