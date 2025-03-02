package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Product1;
import in.codingAge.ecommerce.service.Product1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/product1")
public class Product1Controller {

    @Autowired
    Product1Service product1Service;

    @GetMapping("/name")
    public Product1 findByName(@RequestParam String name) {
        return product1Service.findByName(name);
    }

    @GetMapping("/id")
    public Product1 findById(@RequestParam String id) {
        return product1Service.findById(id);
    }

    @GetMapping("/type")
    public Product1 findByType(@RequestParam String type) {
        return product1Service.findByType(type);
    }

    @GetMapping("/title")
    public Product1 findByTitle(@RequestParam String type) {
        return product1Service.findByTitle(type);
    }

    @GetMapping("/name/type/title")
    public Optional<Product1> findByNameAndTypeAndTitle(@RequestParam String name,@RequestParam String type , @RequestParam String title){
        return product1Service.findByNameAndTypeAndTitle(name,type,title);
    }

    @GetMapping("/name/ortype")
    Optional<Product1> findByNameOrType(@RequestParam String name,@RequestParam String type){
        return product1Service.findByNameAndType(name,type);
    }

    @GetMapping("/exists")
    public boolean existsByName(@RequestParam String name) {
        return product1Service.existsByName(name);
    }

    @GetMapping("/nameAndType")
    public Optional<Product1> findByNameAndType(@RequestParam String name, @RequestParam String type) {
        return product1Service.findByNameAndType(name, type);
    }

    @GetMapping("/nameContaining")
    public List<Product1> findByNameContaining(@RequestParam String name) {
        return product1Service.findByNameContaining(name);
    }

    @GetMapping("/nameStartingWith")
    public List<Product1> findByNameStartingWith(@RequestParam String name) {
        return product1Service.findByNameStartingWith(name);
    }

    @GetMapping("/dateCreated")
    public List<Product1> findAllByCreateDate(@RequestParam Date date) {
        return product1Service.findAllByCreateDate(date);
    }

    @GetMapping("/dateCreatedAfter")
    public List<Product1> findAllByCreateDateAfter(@RequestParam Date date) {
        return product1Service.findAllByCreateDateAfter(date);
    }

    @GetMapping("/dateCreatedBefore")
    public List<Product1> findAllByCreateDateBefore(@RequestParam Date date) {
        return product1Service.findAllByCreateDateBefore(date);
    }

    @GetMapping("/datesizein")
    public List<Product1> findBySizeIn(List<String> types) {
        return product1Service.findBySizeIn( types);
    }


    @GetMapping("/price/lessThanEqual")
    public List<Product1> findAllByPriceLessThanEqual(@RequestParam double price) {
        return product1Service.findAllByPriceLessThanEqual(price);
    }

    @GetMapping("/createDate/between")
    public List<Product1> findAllByCreateDateBetween(@RequestParam Date fromDate, @RequestParam Date toDate) {
        return product1Service.findAllByCreateDateBetween(fromDate, toDate);
    }

    @PostMapping
    public Product1 createProduct1(@RequestBody Product1 product1) {
        return product1Service.createProduct1(product1);
    }

    @GetMapping("/count")
    public long countProducts() {
        return product1Service.countProducts();
    }

}
