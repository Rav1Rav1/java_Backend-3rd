package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.repository.CategoryRepository;
import in.codingAge.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


     public  Category createCategory(Category category) {

     return   categoryRepository.save(category);
    }

    public List<Category> getAllCategory() {
         return categoryRepository.findAll();
    }

    public Optional<Category> getACategory(String id) {
         return categoryRepository.findById(id);
    }

    public Category updateCategory(String id, String name) {

        return categoryRepository.save(id,name);

    }

    public boolean deleteCategory(String id) {
        return categoryRepository.delete(id);
    }
}
