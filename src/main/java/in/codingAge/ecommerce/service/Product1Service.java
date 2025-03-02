package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Product1;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface Product1Service {

    Product1 findByName(String name);
    Product1 findByType(String name);
    boolean existsByName(String name);
    Optional<Product1> findByNameAndType(String name, String type);
    Optional<Product1> findByNameOrType(String name, String type);
    List<Product1> findByNameContaining(String name);
    List<Product1> findAllByPriceLessThanEqual(double price);
    List<Product1> findAllByCreateDateBetween(Date fromDate, Date toDate);
    Product1 createProduct1(Product1 product1);


    Product1 findById(String id);

    Product1 findByTitle(String type);

    Optional<Product1> findByNameAndTypeAndTitle(String name ,String type, String title);

    List<Product1> findByNameStartingWith(String name);

    List<Product1> findAllByCreateDate(Date date);

    List<Product1> findAllByCreateDateAfter(Date date);

    List<Product1> findAllByCreateDateBefore(Date date);

    List<Product1> findBySizeIn(List<String> types);

    long countProducts();
}
