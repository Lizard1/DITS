package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.LiteratureDao;
import incubator.siteoftesting.model.Literature;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LiteratureDaoImpl implements LiteratureDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(){
        Session session = sessionFactory.getCurrentSession();
    }

    @Override
    public List<Literature> findAllLiteratures() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Literature").list();
    }

    @Override
    public Literature findLiteratureById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Literature.class, id);
    }

    @Override
    public void create(Literature literature) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(literature);
    }

    @Override
    public void update(Literature literature) {
        Session session = sessionFactory.getCurrentSession();
        session.update(literature);
    }

    @Override
    public void delete(Literature literature) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(literature);
    }
}
