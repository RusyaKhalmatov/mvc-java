package ru.rusya.dao;

import ru.rusya.models.Menu;
import org.springframework.stereotype.Component;
import ru.rusya.models.Menu;

import java.util.List;

@Component
public class SomeList {

    private List<Menu> menuList;

    {
        menuList.add(new Menu(1,"internet" ));
        menuList.add(new Menu(2,"sarkor telecom", 1 ));
        menuList.add(new Menu(3,"mobile" ));
        menuList.add(new Menu(4,"ucell", 3 ));
        menuList.add(new Menu(5,"mobiuz",3 ));
        menuList.add(new Menu(6,"beeline",3 ));
        menuList.add(new Menu(6,"fibernet",1 ));
        menuList.add(new Menu(6,"ars infom",1 ));
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}
