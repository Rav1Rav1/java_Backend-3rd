package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import in.codingAge.ecommerce.service.imp.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductServiceImpl productService = new ProductServiceImpl();


    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    @GetMapping("/get/all")
    public List<Product> getAllProduct () {
        return productService.getAllProduct();
    }

    @GetMapping("/get/aProduct")
    public Product getAProduct (@RequestParam double id) {
        return productService.getAProduct(id);
    }


    @PutMapping("/update/title")
    public Product updateProduct(@RequestParam double id, @RequestParam String title) {

        return productService.updateProduct(id,title);

    }
    @DeleteMapping("/delete")
    public boolean deleteProduct(@RequestParam double id){
        return productService.deleteProduct(id);

    }

}
