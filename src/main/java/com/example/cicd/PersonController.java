package com.example.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {


    @GetMapping
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("bjarte",20));
        persons.add(new Person("bjarte",22));
        persons.add(new Person("bjarte",24));
        return persons;
    }
}
