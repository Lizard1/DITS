package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.StatisticDao;
import incubator.siteoftesting.model.Statistic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticDaoImpl implements StatisticDao {

    private SessionFactory sessionFactory;



    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Statistic> findAllStatistics() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Statistic ").list();
    }

    @Override
    public Statistic findStatisticById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Statistic.class, id);
    }

    @Override
    public void create(Statistic statistic) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(statistic);
    }

    @Override
    public void update(Statistic statistic) {
        Session session = sessionFactory.getCurrentSession();
        session.update(statistic);
    }

    @Override
    public void delete(Statistic statistic) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(statistic);
    }
}
