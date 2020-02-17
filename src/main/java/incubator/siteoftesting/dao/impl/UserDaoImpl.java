package incubator.siteoftesting.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import incubator.siteoftesting.dao.UserDao;
import incubator.siteoftesting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> findAllUsers() {
       Session session = sessionFactory.getCurrentSession();
       return session.createQuery("from User").list();
    }

    @Override
    public User findUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public User findUserByLogin(String login){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User where login = :login", User.class).setParameter("login", login).list().stream().findAny().orElse(null);
    }

    @Override
    public void create(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }
}
