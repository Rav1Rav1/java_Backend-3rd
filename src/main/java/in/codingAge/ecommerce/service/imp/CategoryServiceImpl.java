package in.codingAge.ecommerce.service.imp;


import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.exception.ResourceNotFoundException;
import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.repository.CategoryRepository;
import in.codingAge.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public Page<Category> getAllCategory(int pageNo , int pageSize) {
        Sort sortByCategorySlides=Sort.by("categorySlides").descending();
        Pageable pageable=PageRequest.of(pageNo,pageSize,sortByCategorySlides);
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Category getACategory(String id) {
        return categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not Found"));
    }

    @Override
    public Category getACategoryByName(String name) {
        return categoryRepository.findByCategoryName(name).orElseThrow(()->new ResourceNotFoundException("Category not Found"));
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
    public void createMultipleCategory() {
        for (int i=1; i<=1000;i++){
            Category category=new Category();
            category.setCategorySlides(i);
            category.setUrl(String.format("Slides : %d",i));
            categoryRepository.save(category);
        }
    }
}