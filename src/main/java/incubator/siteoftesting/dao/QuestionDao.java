package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Question;

import java.util.List;

public interface QuestionDao {
    List<Question> findAllQuestions();
    Question findQuestionById(int id);
    void create(Question question);
    void update(Question question);
    void delete(Question question);
}
