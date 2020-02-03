package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.TestDao;
import incubator.siteoftesting.model.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Test> findAllTests() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Test ").list();
    }

    @Override
    public Test findTestById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Test.class, id);
    }

    @Override
    public void create(Test test) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(test);
    }

    @Override
    public void update(Test test) {
        Session session = sessionFactory.getCurrentSession();
        session.update(test);
    }

    @Override
    public void delete(Test test) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(test);
    }
}
