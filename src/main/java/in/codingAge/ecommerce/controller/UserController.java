package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;
import in.codingAge.ecommerce.service.UserService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
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
    public Page<User> getAllUser (@RequestParam int pageNo,@RequestParam int pageSize) {
        return userService.getAllUser(pageNo,pageSize);
    }

    @GetMapping("/get/aUser")
    public ApiResponse<User> getAUser (@RequestParam String id) {
        return new ApiResponse<>(userService.getAUser(id),"success",null);
    }

    @GetMapping("/get/aUserByName")
    public ApiResponse<User> getAUserByName (@RequestParam String name) {
        return new ApiResponse<>(userService.getAUserByName(name),"success",null);
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
