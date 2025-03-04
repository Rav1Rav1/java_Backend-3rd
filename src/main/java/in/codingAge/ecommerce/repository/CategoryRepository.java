package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {

    Optional<Category> findByCategoryName(String name);

}
