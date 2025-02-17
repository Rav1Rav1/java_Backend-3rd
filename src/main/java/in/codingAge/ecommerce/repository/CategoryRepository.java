package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.Category;

import java.util.List;

public interface CategoryRepository {

    Category createCategory(Category category);

    List<Category> getAllCarousel();

    Category getACategory(double id);

    Category updateCategory(double id, String item);

    boolean deleteCategory(double id);

}
