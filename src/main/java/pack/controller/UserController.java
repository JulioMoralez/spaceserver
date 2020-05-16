package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pack.model.User;
import pack.service.UserService;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    static final String URL = "/user";

    @RequestMapping(value = URL + "/{entity}", method = RequestMethod.GET, produces = "application/json")
    public User find(@PathVariable User entity){
        return entity;
    }

    @RequestMapping(value = URL + "s", method = RequestMethod.GET, produces = "application/json")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = URL, method = RequestMethod.POST, consumes = "application/json")
    public User save(@RequestBody User entity){
        return userService.save(entity);
    }

    @RequestMapping(value = URL + "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Integer delete(@PathVariable Integer id){
        return userService.delete(id);
    }
}
