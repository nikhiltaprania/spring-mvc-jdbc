package org.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.studentmanagement.model.Student;
import org.studentmanagement.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.loadStudents());
        return "student-list";
    }

    @GetMapping("/showAddPage")
    public String showAddPage(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(Student student) {
        if (student.getStudentId() == 0) {
            studentService.saveStudent(student);
        } else {
            studentService.updateStudent(student);
        }
        return "redirect:/";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("userId") int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "add-student";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("userId") int id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}