package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;
import in.codingAge.ecommerce.service.UserService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

//    private final UserServiceImpl userService = new UserServiceImpl();
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @GetMapping("/get/all")
    public List<User> getAllUser () {
        return userService.getAllUser();
    }

    @GetMapping("/get/aUser")
    public User getAUser (@RequestParam String id) {
        return userService.getAUser(id);
    }

    @GetMapping("/get/aUserByName")
    public User getAUserByName (@RequestParam String name) {
        return userService.getAUserByName(name);
    }


    @PutMapping("/update/item")
    public User updateUser(@RequestBody User user) {

        return userService.updateUser(user);

    }
    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam String id){
         userService.deleteUser(id);

    }

}
