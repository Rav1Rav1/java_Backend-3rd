package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.service.ProductService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import in.codingAge.ecommerce.service.imp.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public Page<Product> getAllProduct (@RequestParam int pageNo,@RequestParam int pageSize) {
        return productService.getAllProduct(pageNo,pageSize);
    }

    @GetMapping("/get/aProduct")
    public ApiResponse<Product> getAProduct (@RequestParam String id) {
        return new ApiResponse<>(productService.getAProduct(id),"success",null);
    }

    @GetMapping("/get/aProductByBrand")
    public ApiResponse<Product> getAProductByBrand (@RequestParam String brand) {
        return new ApiResponse<>(productService.getAProductByBrand(brand),"seccess",null);
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
