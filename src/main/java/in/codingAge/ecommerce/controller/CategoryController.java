package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

//    private final CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
    @Autowired
    private CategoryService categoryServiceImpl;


    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        return categoryServiceImpl.createCategory(category);
    }


    @GetMapping("/get/all")
    public List<Category> getAllCategory () {
        return categoryServiceImpl.getAllCategory();
    }

    @GetMapping("/get/aCaruosel")
    public Category getACategory (@RequestParam double id) {
        return categoryServiceImpl.getACategory(id);
    }


    @PutMapping("/update/item")
    public Category updateCategory(@RequestParam double id, String item) {

        return categoryServiceImpl.updateCategory(id,item);

    }
    @DeleteMapping("/delete")
    public boolean deleteCategory(@RequestParam double id){
        return categoryServiceImpl.deleteCategory(id);

    }
}
