package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.service.CategoryService;
import in.codingAge.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categorService;

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categorService.createCategory(category);
    }

    @PostMapping("/create")
    public void createMultipleCategory() {
        categorService.createMultipleCategory();
    }


    @GetMapping("/get/all")

    public Page<Category> getAllCategory (@RequestParam int pageNo , @RequestParam int pageSize) {
        return categorService.getAllCategory(pageNo, pageSize);
    }

    @GetMapping("/get/aCategory")
    public ApiResponse<Category> getACategory (@RequestParam String id) {
       return new ApiResponse<>(categorService.getACategory(id),"success",null) ;
    }

    @GetMapping("/get/aCategoryByName")
    public ApiResponse<Category> getACategoryByName (@RequestParam String name) {
      return new ApiResponse<>(categorService.getACategoryByName(name),"success",null);
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

