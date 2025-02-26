package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.service.ProductService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import in.codingAge.ecommerce.service.imp.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

//    private final ProductServiceImpl productService = new ProductServiceImpl();

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    @GetMapping("/get/all")
    public List<Product> getAllProduct () {
        return productService.getAllProduct();
    }

    @GetMapping("/get/aProduct")
    public Product getAProduct (@RequestParam String id) {
        return productService.getAProduct(id);
    }

    @GetMapping("/get/aProductByBrand")
    public Product getAProductByBrand (@RequestParam String brand) {
        return productService.getAProductByBrand(brand);
    }


    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {

        return productService.updateProduct(product);

    }
    @DeleteMapping("/delete")
    public void deleteProduct(@RequestParam String id){
         productService.deleteProduct(id);

    }

}
