package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.exception.ProductNotFoundException;
import in.codingAge.ecommerce.model.User;
//import in.codingAge.ecommerce.repository.imp.UserRepositoryImpl;
import in.codingAge.ecommerce.repository.UserRepository;
import in.codingAge.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public Page<User> getAllUser(int pageNo, int pageSize) {
        Sort sortbyname=Sort.by("name").ascending();
        Pageable pageable= PageRequest.of(pageNo,pageSize,sortbyname);
        return userRepository.findAll(pageable);
    }

    @Override
    public User getAUser(String id) {
        return userRepository.findById(id).orElseThrow(()->new  ProductNotFoundException("User not found "));
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
        return userRepository.findByName(name).orElseThrow(()->new  ProductNotFoundException("User not found "));
    }
}
