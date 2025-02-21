package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CategoryService {

    Category createCategory( Category category);

    List<Category> getAllCategory();

    Category getACategory(String id);

    Category updateCategory(String id, String name);

    boolean deleteCategory(String id);

}
