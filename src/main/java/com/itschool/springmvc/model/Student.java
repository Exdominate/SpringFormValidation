package com.itschool.springmvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {

    @Size(min = 3, max = 30)
    private String firstName;
    @Size(min = 3, max = 30)
    private String lastName;
    @NotEmpty
    private String Sex;
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    @Past
    @NotNull
    private Date dob;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String section;
    @NotEmpty
    private String country;
    private boolean firstAttempt;   
    @NotEmpty
    private List<String> subjects=new ArrayList<String>();

    public Student() {
    }

    public Student(String firstName, String lastName, String Sex, Date dob, String email, String section, String country, boolean firstAttempt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Sex = Sex;
        this.dob = dob;
        this.email = email;
        this.section = section;
        this.country = country;
        this.firstAttempt = firstAttempt;
    }   
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isFirstAttempt() {
        return firstAttempt;
    }

    public void setFirstAttempt(boolean firstAttempt) {
        this.firstAttempt = firstAttempt;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
