package ru.romzhel.lesson_7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.romzhel.lesson_7.entities.Student;
import ru.romzhel.lesson_7.services.StudentService;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String getAllStudents(Model model) {
        List<Student> studentsList = studentService.getAllStudents();
        model.addAttribute("students", studentsList);
        return "students";
    }

    @GetMapping("/edit-form")
    public String openEditForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/edit-form")
    public String getStudentFromEditForm(@ModelAttribute Student student) {
        System.out.println(student);
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable Long id) {
        studentService.removeStudentById(id);
        return "redirect:/students";
    }
}
