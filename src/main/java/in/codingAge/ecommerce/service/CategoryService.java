package in.codingAge.ecommerce.service;


import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.model.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {


    Category createCategory(Category category);

    Page<Category> getAllCategory(int pageNo , int pageSize);

    Category getACategory(String id);

    Category getACategoryByName(String name);

    void updateCategory(String id, String name);

    void deleteCategory(String id);

    void createMultipleCategory();
}
