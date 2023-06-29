
package com.prueba1.controllers;

import com.prueba1.entities.Students;
import com.prueba1.service.IStudentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentsController {
    private final IStudentsService studentsService;
    
    public StudentsController(IStudentsService studentsService) {
        this.studentsService = studentsService;
    }
    @GetMapping("/students")
    public String index(Model model) {
        model.addAttribute("students", new Students());
        model.addAttribute("students", this.studentsService.getAllStudents());
        return "students";
    }
    @PostMapping("students/save")
    public String save(@ModelAttribute("students") Students students) {
        this.studentsService.save(students);
        return "redirect:/students";
    }
    @PostMapping("product/students")
    public ResponseEntity<String> delete(@RequestBody Students students) {
        this.studentsService.delete(students);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
