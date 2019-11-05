package com.itschool.springmvc.controller;

import com.itschool.springmvc.model.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StudentController {
     @RequestMapping(method = RequestMethod.GET)
    public String newRegistration(ModelMap model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "enroll";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String saveRegistation(@Valid Student student,
            BindingResult result,ModelMap model){
        if (result.hasErrors())
            return "enroll";        
        model.addAttribute("success","Dear "+student.getFirstName()+
                ", your registration has been complited successfully" );
        return "success";
    }

    @ModelAttribute("sections")
    public List<String> InitializeSections() {
        List<String> sections = new ArrayList<String>();
        sections.add("Graduate");
        sections.add("Post Graduate");
        sections.add("Research");
        return sections;
    }       

    @ModelAttribute("countries")
    public Set<String> InitializeCountries() {
        Set<String> countries = new HashSet<String>();
        countries.add("USA");
        countries.add("RUSSIA");
        countries.add("FRANCE");
        countries.add("GERMANY");
        countries.add("ITALY");
        return countries;
    }

    @ModelAttribute("subjects")
    public List<String> InitializeSubjects() {
        List<String> subjects = new ArrayList<String>();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Informatics");
        return subjects;
    }  

   
}
