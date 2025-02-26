package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.service.CategoryService;
import in.codingAge.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categorService;

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        return categorService.createCategory(category);
    }


    @GetMapping("/get/all")
    public List<Category> getAllCategory () {
        return categorService.getAllCategory();
    }

    @GetMapping("/get/aProduct")
    public Category getACategory (@RequestParam String id) {
       return   categorService.getACategory(id);
    }

    @GetMapping("/get/aProductByName")
    public Category getACategoryByName (@RequestParam String name) {
      return categorService.getACategoryByName(name);
    }


    @PutMapping("/update/title")
    public void updateCategory(@RequestParam String id, @RequestParam String title) {

         categorService.updateCategory(id,title);

    }
    @DeleteMapping("/delete")
    public void deleteCategory(@RequestParam String id){
         categorService.deleteCategory(id);

    }

}

