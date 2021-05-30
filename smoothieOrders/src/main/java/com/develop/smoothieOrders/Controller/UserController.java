package com.develop.smoothieOrders.Controller;


import com.develop.smoothieOrders.Models.User;
import com.develop.smoothieOrders.Repository.UserJPARepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserJPARepository userJPARepository;

    @GetMapping                      //IT WORKS PROPERLY
    public List<User> getAllUsers() {
        return  userJPARepository.findAll();
    }

    @GetMapping                      // Issue was here with LazyLoading it was solved by using jsonIgnore
    @RequestMapping("{id}")
    public User getUserById(@PathVariable Long id){
        return userJPARepository.getById(id);
    }

    @PostMapping   //IT WAS PROPERLY
    public User addUser(@RequestBody final User user){
        return userJPARepository.saveAndFlush(user);
    }

    @RequestMapping(value = "{userId}",method = RequestMethod.PUT)
    public User updateUser(@PathVariable Long userId,@RequestBody User user){
        User existingUser = userJPARepository.getById(userId);
        BeanUtils.copyProperties(user,existingUser,"user_Id");
        return userJPARepository.saveAndFlush(existingUser);
    }

    @RequestMapping(value="{id}",method = RequestMethod.DELETE)  //Issue was with using @deletemapping it doesn't work
    public void deleteUser(@PathVariable Long id){
        userJPARepository.deleteById(id);

    }
}
