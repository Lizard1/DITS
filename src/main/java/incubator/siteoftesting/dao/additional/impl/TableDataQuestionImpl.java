package incubator.siteoftesting.dao.additional.impl;

import incubator.siteoftesting.dao.additional.TableDataQuestionDao;
import incubator.siteoftesting.model.Statistic;
import incubator.siteoftesting.model.additional.TableDataQuestion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TableDataQuestionImpl implements TableDataQuestionDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<TableDataQuestion> findDataForQuestions() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("").list();
    }
}

