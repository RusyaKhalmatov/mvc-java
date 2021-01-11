package ru.rusya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.rusya.dao.PersonDao;
import ru.rusya.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }

//    @GetMapping()
//    public String index(Model model){
//        //получим всех людей из ДАО
//        model.addAttribute("people", personDao.index());
//        return "people/index";
//    }

//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model){
//        //получим одного человека по его айди из ДАО
//        model.addAttribute("person",personDao.show(id));
//        return "people/show";
//    }

    @GetMapping("/new")
    public String newPerson(Model model){
        model.addAttribute("person", new Person());
        return "people/new";
    }

//    @PostMapping()
//    public String create(@ModelAttribute("person") Person person){
//        this.personDao.save(person);
//        return "redirect:/people";
//    }
}
