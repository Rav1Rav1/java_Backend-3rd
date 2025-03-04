package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    User createUser(User user);

    Page<User> getAllUser(int pageNo,int pageSize);

    User getAUser(String id);

    User updateUser(User user);

    void deleteUser(String id);


    User getAUserByName(String name);
}
