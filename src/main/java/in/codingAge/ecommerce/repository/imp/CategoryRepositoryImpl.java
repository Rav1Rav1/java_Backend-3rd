package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    List<Category> categories=new ArrayList<>();

    public Category createCategory(Category category) {

        categories.add(category);
        return category;
    }

    @Override
    public List<Category> getAllCarousel() {
        return categories;
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

    public Category updateCategory(double id, String name) {

        for (Category category : categories) {
            if(category.getId() == id) {
                category.setCategoryName(name);
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
