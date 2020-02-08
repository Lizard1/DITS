package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.AnswerDao;
import incubator.siteoftesting.model.Answer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerDaoImpl implements AnswerDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Answer> findAllAnswers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Answer").list();
    }

    @Override
    public Answer findAnswerById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Answer.class, id);
    }

    @Override
    public void create(Answer answer) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(answer);
    }

    @Override
    public void update(Answer answer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(answer);
    }

    @Override
    public void delete(Answer answer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(answer);
    }
}
