package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.QuestionDao;
import incubator.siteoftesting.model.Question;
import incubator.siteoftesting.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public List<Question> getAllQuestions() {
        return questionDao.findAllQuestions();
    }

    @Override
    @Transactional
    public Question getQuestionById(int id) {
        return questionDao.findQuestionById(id);
    }

    @Override
    @Transactional
    public void createQuestion(Question question) {
        questionDao.create(question);
    }

    @Override
    @Transactional
    public void updateQuestion(Question question) {
        questionDao.update(question);
    }

    @Override
    @Transactional
    public void deleteQuestion(Question question) {
        questionDao.delete(question);
    }
}
