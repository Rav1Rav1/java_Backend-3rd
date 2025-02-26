package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product getAProduct(String id);

    Product updateProduct(Product product);

    void deleteProduct(String id);

    Product getAProductByBrand(String id);
}
