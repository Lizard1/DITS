package incubator.siteoftesting.dao.additional.impl;

import incubator.siteoftesting.dao.additional.TableDataTestDao;
import incubator.siteoftesting.model.Statistic;
import incubator.siteoftesting.model.additional.TableDataTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class TableDataTestDaoImpl implements TableDataTestDao {

    private SessionFactory sessionFactory;

    @Autowired
    private void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<TableDataTest> findDataForTests(int id) {
        Session session = sessionFactory.getCurrentSession();
        findsomething(id);
        return session.createQuery("").list();
    }
    //from Cat as cat where cat.mate.name like '%s%'

    public int findsomething(int id){
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(
                "select Statistic " +
                        "from Statistic as s where s.testS is not null and s.userStat.userId =:id").setParameter("id", id);
        /*int count =  session.createQuery(
                "select Statistic " +
                        "from Statistic as s where s.testS is not null and s.userStat.userId =:id").setParameter("id", id).list().size();*/
        query.setParameter("id", id);
        int count = ((org.hibernate.query.Query) query).list().size();
        return count;
    }
}
/*
*
*  Query query = session.createQuery("from user where login = :login");
        int count =  session.createQuery(
                "select Statistic " +
                        "from Statistic as s where s.testS is not null and s.userStat.userId =:id").setParameter("id", id).list().size();
        query.setParameter("login", login);
        return count;*/