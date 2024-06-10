package web.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private UserDaoImp userDaoImp;

    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public void addUser(User user) {
        userDaoImp.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDaoImp.deleteUser(id);
    }

    @Override
    public void editUser(User user) {
        userDaoImp.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDaoImp.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDaoImp.getAllUser();
    }
}
