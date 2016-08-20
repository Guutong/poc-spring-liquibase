package xyz.guutong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.guutong.model.Person;
import xyz.guutong.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    private PersonRepository personRepo;

    @RequestMapping("/persons")
    public List<Person> listPerson(){
        return (List<Person>) personRepo.findAll();
    }
}
