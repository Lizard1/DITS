package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Answer;

import java.util.List;

public interface AnswerDao {
    List<Answer> findAllAnswers();
    Answer findAnswerById(int id);
    void create(Answer answer);
    void update(Answer answer);
    void delete(Answer answer);
}
