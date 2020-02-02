package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.QuestionDao;
import incubator.siteoftesting.model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Question> findAllQuestions() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Question ").list();
    }

    @Override
    public Question findQuestionById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Question.class, id);
    }

    @Override
    public void create(Question question) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(question);
    }

    @Override
    public void update(Question question) {
        Session session = sessionFactory.getCurrentSession();
        session.update(question);
    }

    @Override
    public void delete(Question question) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(question);
    }
}
