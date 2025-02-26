package in.codingAge.ecommerce.service;


import in.codingAge.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {


    Category createCategory(Category category);

    List<Category> getAllCategory();

    Category getACategory(String id);

    void updateCategory(String id, String name);

    void deleteCategory(String id);

    Category getACategoryByName(String name);
}
