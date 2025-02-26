package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.repository.ProductRepository;
import in.codingAge.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getAProduct(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Product product1) {
      return   productRepository.save(product1);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getAProductByBrand(String id) {
        return productRepository.findByBrand();
    }
}
