package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {


    Optional<User> findByName(String name);
}
