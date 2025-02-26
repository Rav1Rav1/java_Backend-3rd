package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUser();

    User getAUser(String id);

    User updateUser(User user);

    void deleteUser(String id);


    User getAUserByName(String name);
}
