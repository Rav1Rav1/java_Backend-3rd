package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.EcommerceCarousel;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl {

    List<Category> categories=new ArrayList<>();

    public Category createCategory(Category category) {

        categories.add(category);
        return category;
    }

    public List<Category> getAllCategory() {
        return categories;
    }

    public Category getACategory(double id) {
        for( Category category : categories){
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public Category updateCategory(double id, String item) {

        for( Category category : categories){
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public boolean deleteCategory(double id) {
        for (Category category : categories){
            if (category.getId()==id){
                categories.remove(category);
                return true;

            }
        }
        return false;
    }

}
