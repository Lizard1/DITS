package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.AnswerDao;
import incubator.siteoftesting.model.Answer;
import incubator.siteoftesting.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;


    @Override
    @Transactional
    public List<Answer> getAllAnswers() {
        return answerDao.findAllAnswers();
    }

    @Override
    @Transactional
    public Answer getAnswerById(int id) {
        return answerDao.findAnswerById(id);
    }

    @Override
    @Transactional
    public void create(Answer answer) {
        answerDao.create(answer);
    }

    @Override
    @Transactional
    public void update(Answer answer) {
        answerDao.update(answer);
    }

    @Override
    @Transactional
    public void deleteAnswer(Answer answer) {
        answerDao.delete(answer);
    }
}
