package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUser();

    User getAUser(double id);

    User updateUser(double id, String name);

    boolean deleteUser(double id);


}
