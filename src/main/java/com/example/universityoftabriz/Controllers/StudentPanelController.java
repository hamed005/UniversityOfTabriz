package com.example.universityoftabriz.Controllers;

import com.example.universityoftabriz.Objects.Student;
import com.example.universityoftabriz.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class StudentPanelController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/StudentPanel")
    public String StudentPanel(Model model){
        Optional<Student> student = studentService.getStudentById(LoginController.uid);
        Student student1 = student.get();

        String ImageUrl = student1.getPhoto();
        model.addAttribute("ImageURL" , ImageUrl);

        return "StudentPanel";
    }

    @GetMapping("/StudentPanel/getInfo")
    @ResponseBody
    public Optional<Student> getStudentInfo(){
        Optional<Student> student = studentService.getStudentById(LoginController.uid);
        return Optional.of(student.get());
    }

    @GetMapping("/StudentPanel/LogOut")
    @ResponseBody
    public boolean Logout(){
        LoginController.uid = 100;
        return true;
    }
}
