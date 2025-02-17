package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.User;

import java.util.List;

public interface UserRepository {

    User createUser(User user);

    List<User> getAllUser();

    User getAUser(double id);

    User updateUser(double id, String name);

    boolean deleteUser(double id);

}
