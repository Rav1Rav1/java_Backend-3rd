package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {

    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product getAProduct(double id);

    Product updateProduct(double id, String title);

    boolean deleteProduct(double id);

}
