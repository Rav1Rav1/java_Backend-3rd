package in.codingAge.ecommerce.service.imp;


import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.repository.CategoryRepository;
import in.codingAge.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepository categoryRepository;
    public Category createCategory(Category category) {
         return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getACategory(String id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void updateCategory(String id, String name) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            category.setCategoryName(name);
            categoryRepository.save(category);
        }
    }

    @Override
    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);

    }

    @Override
    public Category getACategoryByName(String name) {
        return categoryRepository.findByCategoryName(name);
    }
}