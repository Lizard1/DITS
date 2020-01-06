package incubator.siteoftesting.service;

import incubator.siteoftesting.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void create(User user);
    void update(User user);
    void deleteUser(User user);
}
