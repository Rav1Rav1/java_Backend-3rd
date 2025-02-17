package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl {

    List<User> users=new ArrayList<>();

    public User createUser(User user) {

        users.add(user);
        return user;
    }

    public List<User> getAllUser() {
        return users;
    }

    public User getAUser(double id) {
        for( User user : users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User updateUser(double id, String name) {

        for (User user : users) {
            if(user.getId() == id) {
                user.setName(name);
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(double id) {
        for (User user : users){
            if (user.getId()==id){
                users.remove(user);
                return true;

            }
        }
        return false;
    }


}
