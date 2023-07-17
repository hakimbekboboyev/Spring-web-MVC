package org.example.controller;

import org.example.controller.database.Database;
import org.example.controller.model.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {





    @RequestMapping(path = "/student", method = RequestMethod.GET)
    public String studentList(Model model){
        Database database = new Database();

        model.addAttribute("students",database.listStudent());
        return "student";
    }

    @RequestMapping(path = "/addStudent", method = RequestMethod.GET)
    public String addStudentView(){
        return "addStudent";
    }

    @RequestMapping(path = "/addStudent", method = RequestMethod.POST)
    public RedirectView addStudent(Model model, HttpServletRequest request){

        Database database = new Database();
        String fullName = request.getParameter("fullName");
        Integer age = Integer.valueOf(request.getParameter("age"));
        String phoneNumber = request.getParameter("phoneNumber");
        Student newStudent = new Student(fullName,age,phoneNumber);

        boolean b = database.addStudent(newStudent);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/student");
        return redirectView;
    }
}
