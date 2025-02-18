package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.repository.imp.CategoryRepositoryImpl;
import in.codingAge.ecommerce.repository.imp.ProductRepositoryImpl;
import in.codingAge.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    public Product createProduct(Product product) {

        return   productRepository.createProduct(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    public Product getAProduct(double id) {
        return productRepository.getAProduct(id);
    }

    public Product updateProduct(double id, String title) {

        return productRepository.updateProduct(id,title);

    }

    public boolean deleteProduct(double id) {
        return productRepository.deleteProduct(id);
    }

}
