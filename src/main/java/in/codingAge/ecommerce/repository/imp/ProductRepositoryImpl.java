package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.Product;
import in.codingAge.ecommerce.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> products=new ArrayList<>();

    public Product createProduct(Product product) {

        products.add(product);
        return product;
    }

    public List<Product> getAllProduct() {
        return products;
    }

    public Product getAProduct(double id) {
        for( Product product : products){
            if(product.getProductId()==id){
                return product;
            }
        }
        return null;
    }

    public Product updateProduct(double id, String title) {

        for (Product product : products) {
            if(product.getProductId() == id) {
                product.setTitle(title);
                return product;
            }
        }
        return null;
    }

    public boolean deleteProduct(double id) {
        for (Product product : products){
            if (product.getProductId()==id){
                products.remove(product);
                return true;

            }
        }
        return false;
    }


}
