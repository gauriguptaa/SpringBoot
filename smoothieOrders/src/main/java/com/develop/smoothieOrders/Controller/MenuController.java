package com.develop.smoothieOrders.Controller;

import com.develop.smoothieOrders.Models.Menu;
import com.develop.smoothieOrders.Repository.MenuJPARepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {
    @Autowired
      MenuJPARepository menuJPARepository;

    @GetMapping
    public List<Menu> getMenu() {
        return menuJPARepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Menu getMenuById(@PathVariable Long id){
        return menuJPARepository.getById(id);
    }

    @PostMapping
    public Menu addMenu(@RequestBody final Menu menu){
        return menuJPARepository.saveAndFlush(menu);
    }

    @RequestMapping(value = "{menuId}",method = RequestMethod.PUT)
    public Menu updateUser(@PathVariable Long menuId,@RequestBody Menu menu){
        Menu existingMenu = menuJPARepository.getById(menuId);
        BeanUtils.copyProperties(menu,existingMenu,"menuId");
        return menuJPARepository.saveAndFlush(existingMenu);
    }

    @RequestMapping(value = "{menuId}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long menuId){
        menuJPARepository.deleteById(menuId);

    }
}
