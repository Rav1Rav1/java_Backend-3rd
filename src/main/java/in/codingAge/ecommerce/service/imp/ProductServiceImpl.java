package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.exception.ProductNotFoundException;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.repository.ProductRepository;
import in.codingAge.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public Page<Product> getAllProduct(int pageNo, int pageSize) {

        Sort  sortbyPrice=Sort.by("price").ascending();
        Pageable pageable= PageRequest.of(pageNo,pageSize,sortbyPrice);
        return productRepository.findAll(pageable);
    }

    @Override
    public Product getAProduct(String id) {
        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Product Not Found"));
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
    public Product getAProductByBrand(String brand) {
        return productRepository.findByBrand(brand).orElseThrow(()->new ProductNotFoundException("Product Not Found"));
    }
}
