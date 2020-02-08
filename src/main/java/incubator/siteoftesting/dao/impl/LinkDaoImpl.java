package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.LinkDao;
import incubator.siteoftesting.model.Link;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LinkDaoImpl implements LinkDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Link> findAllLinks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Link").list();
    }

    @Override
    public Link findLinkById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Link.class, id);
    }

    @Override
    public void create(Link link) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(link);
    }

    @Override
    public void update(Link link) {
        Session session = sessionFactory.getCurrentSession();
        session.update(link);
    }

    @Override
    public void delete(Link link) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(link);
    }
}
