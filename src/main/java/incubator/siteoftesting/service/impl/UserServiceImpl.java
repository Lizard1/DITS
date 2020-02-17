package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.UserDao;
import incubator.siteoftesting.model.User;
import incubator.siteoftesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    @Transactional
    public User getUserByLogin(String login){
        return userDao.findUserByLogin(login);
    }

    @Override
    @Transactional
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
