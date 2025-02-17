package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.repository.imp.CategoryRepositoryImpl;
import in.codingAge.ecommerce.repository.imp.EcommerceCarouselRepositoryImp;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CategoryServiceImpl {

    CategoryRepositoryImpl categoryRepositoryImpl = new CategoryRepositoryImpl();


     public  Category createCategory(Category category) {

     return   categoryRepositoryImpl.createCategory(category);
    }

    public List<Category> getAllCategory() {
         return categoryRepositoryImpl.getAllCategory();
    }

    public Category getACategory(double id) {
         return categoryRepositoryImpl.getACategory(id);
    }

    public Category updateCategory(double id, String item) {

        return categoryRepositoryImpl.updateCategory(id,item);

    }

    public boolean deleteCategory(double id) {
        return categoryRepositoryImpl.deleteCategory(id);
    }
}
