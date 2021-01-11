package ru.rusya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rusya.dao.SomeList;
import ru.rusya.models.Menu;

@Controller
@RequestMapping("/first")
public class MenuController {
    private SomeList someList;

    @Autowired
    public void MainController(SomeList someList) {
        System.out.println("Creating controler"
        );
        this.someList = someList;
    }

    @GetMapping("/list")
    public String index(Model model){
        System.out.println("Hello");
        for (Menu item:
                this.someList.getMenuList()) {
            System.out.println("Item + " + item.getName() + " " + item.getId() + " " + item.getParent_id());
        }
        return "list";
    }
}
