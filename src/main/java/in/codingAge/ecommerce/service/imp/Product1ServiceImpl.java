package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.exception.ProductNotFoundException;
import in.codingAge.ecommerce.model.Product1;
import in.codingAge.ecommerce.repository.Product1Repository;
import in.codingAge.ecommerce.service.Product1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class Product1ServiceImpl implements Product1Service {
    @Autowired
    Product1Repository product1Repository;

    @Override
    public Product1 findByName(String name) {
        return product1Repository.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
    }

    @Override
    public Product1 findByType(String type) {
        return product1Repository.findByType(type).orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
    }

    @Override
    public Product1 findById(String id) {
        return product1Repository.findById(id).orElseThrow(()-> new ProductNotFoundException("product not found "));
    }

    @Override
    public Product1 findByTitle(String title) {
        return product1Repository.findByTitle(title).orElseThrow(()->new ProductNotFoundException(" Product not found"));
    }

    @Override
    public Optional<Product1> findByNameAndTypeAndTitle(String name, String type, String title) {

            return product1Repository.findByNameAndTypeAndTitle(name, type, title)
                    .or(() -> { throw new ProductNotFoundException("Product not found"); });

    }

    @Override
    public List<Product1> findByNameStartingWith(String name) {
        return product1Repository.findByNameStartingWith(name);
    }

    @Override
    public List<Product1> findAllByCreateDate(Date date) {
        return product1Repository.findAllByCreateDate(date);
    }

    @Override
    public List<Product1> findAllByCreateDateAfter(Date date) {
        return product1Repository.findAllByCreateDateAfter(date);
    }

    @Override
    public List<Product1> findAllByCreateDateBefore(Date date) {
        return product1Repository.findAllByCreateDateBefore(date);
    }

    @Override
    public List<Product1> findBySizeIn(List<String> types) {
        return product1Repository.findBySizeIn(types);
    }

    @Override
    public long countProducts() {
        return product1Repository.count();
    }

    @Override
    public boolean existsByName(String name) {
        return product1Repository.existsByName(name);
    }

    @Override
    public Optional<Product1> findByNameAndType(String name, String type) {
        Optional<Product1> byNameAndType = product1Repository.findByNameAndType(name, type);
        return byNameAndType;
    }

    @Override
    public Optional<Product1> findByNameOrType(String name, String type) {
        Optional<Product1> byNameOrType=product1Repository.findByNameOrType(name,type);
        return byNameOrType;
    }

    @Override
    public List<Product1> findByNameContaining(String name) {
        return product1Repository.findByNameContaining(name);
    }

    @Override
    public List<Product1> findAllByPriceLessThanEqual(double price) {
        return product1Repository.findAllByPriceLessThanEqual(price);
    }

    @Override
    public List<Product1> findAllByCreateDateBetween(Date fromDate, Date toDate) {
        return product1Repository.findAllByCreateDateBetween(fromDate, toDate);
    }

    @Override
    public Product1 createProduct1(Product1 product1) {
        return product1Repository.save(product1);
    }




}
