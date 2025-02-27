package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Product1;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface Product1Repository extends MongoRepository<Product1 ,String> {

    Optional<Product1> findByName(String name);

    boolean existsByName(String name);

    Optional<Product1> findByNameAndType(String name);

    Optional<Product1> findByNameAndTypeAndTitle(String name, String type ,String title);

    Optional<Product1> findByNameOrType(String name,String type);

    List<Product1> findByNameContaining(String name);

    List<Product1> findByNameStartingWith(String name);

    List<Product1> findByNameEndingWith(String name);

    List<Product1> findAllByCreateDate(Date date);

    List<Product1> findAllByCreateDateAfter(Date date);

    List<Product1> findAllByCreateDateBefore(Date date);

    List<Product1> findAllByCreateDateGreaterThan(Date date);

    List<Product1> findAllByCreateDateGreaterThanEqual(Date date);

    List<Product1> findAllByCreateDateLessThanEqual(Date date);

    List<Product1> findAllByCreateDateBetween(Date fromDate, Date toDate);

    List<Product1> findAllByPriceLessThanEqual(double price);

    List<Product1> findBySizeIn(String size);

    List<Product1> findBySizeIn(List<String> types);

//    existsBy
//    count

}
