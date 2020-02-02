package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.TopicDao;
import incubator.siteoftesting.model.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicDaoImpl implements TopicDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Topic> findAllTopics() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Topic").list();
    }

    @Override
    public Topic findTopicById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Topic.class, id);
    }

    @Override
    public void create(Topic topic) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(topic);
    }

    @Override
    public void update(Topic topic) {
        Session session = sessionFactory.getCurrentSession();
        session.update(topic);
    }

    @Override
    public void delete(Topic topic) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(topic);
    }
}
