
package com.prueba1.db;

import org.springframework.data.repository.CrudRepository;
import com.prueba1.entities.Students;

public interface IStudentsRepository extends CrudRepository<Students, Integer>{
    
}
