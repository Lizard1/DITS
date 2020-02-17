package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers();
    User findUserById(int id);
    User findUserByLogin(String login);
    void create(User user);
    void update(User user);
    void delete(User user);
}
