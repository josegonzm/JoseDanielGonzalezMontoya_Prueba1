
package com.prueba1.controllers;
import com.prueba1.service.IStudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    private final IStudentsService studentsService;
    public indexController(IStudentsService studentsService) {
        this.studentsService = studentsService;
    }
    
     @GetMapping("/")
    public String index(Model model) {
        var students = this.studentsService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }
}
