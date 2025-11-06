package com.springverse.thymeleaf.controller;

import com.springverse.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {
        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);
        System.out.println("🥝 theModel = " + theModel);

        return "student-form";
    }
}
