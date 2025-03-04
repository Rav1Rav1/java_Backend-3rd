package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Page<Product> getAllProduct(int pageNo, int pageSize);

    Product getAProduct(String id);

    Product updateProduct(Product product);

    void deleteProduct(String id);

    Product getAProductByBrand(String brand);
}
