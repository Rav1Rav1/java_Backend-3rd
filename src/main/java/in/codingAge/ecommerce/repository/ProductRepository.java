package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {


    Optional<Product> findByBrand(String brand);
}
