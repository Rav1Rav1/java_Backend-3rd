package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {

    Category createProduct(Product product);

    List<Category> getAllProduct();

    Category getAProduct(double id);

    Category updateProduct(double id, String title);

    boolean deleteProduct(double id);

}
