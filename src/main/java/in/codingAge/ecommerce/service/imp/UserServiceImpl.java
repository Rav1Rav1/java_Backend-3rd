package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.User;
//import in.codingAge.ecommerce.repository.imp.UserRepositoryImpl;
import in.codingAge.ecommerce.repository.UserRepository;
import in.codingAge.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
      return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getAUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {

        userRepository.deleteById(id);
    }

    @Override
    public User getAUserByName(String name) {
        return userRepository.findByName();
    }
}
