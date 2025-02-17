package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import in.codingAge.ecommerce.service.imp.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserServiceImpl userService = new UserServiceImpl();


    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createCategory(user);
    }


    @GetMapping("/get/all")
    public List<User> getAllUser () {
        return userService.getAllUser();
    }

    @GetMapping("/get/aUser")
    public User getAUser (@RequestParam double id) {
        return userService.getAUser(id);
    }


    @PutMapping("/update/item")
    public User updateUser(@RequestParam double id, String name) {

        return userService.updateUser(id,name);

    }
    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestParam double id){
        return userService.deleteUser(id);

    }

}
