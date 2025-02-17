package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;
import in.codingAge.ecommerce.repository.imp.CategoryRepositoryImpl;
import in.codingAge.ecommerce.repository.imp.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl {

    UserRepositoryImpl userRepository = new UserRepositoryImpl();


    public User createUser(User user) {

        return  userRepository.createUser(user);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public User getAUser(double id) {
        return userRepository.getAUser(id);
    }

    public User updateUser(double id, String name) {

        return userRepository.updateUser(id,name);

    }

    public boolean deleteUser(double id) {
        return userRepository.deleteUser(id);
    }

}
