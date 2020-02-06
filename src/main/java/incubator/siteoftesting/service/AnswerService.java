package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> getAllAnswers();
    Answer getAnswerById(int id);
    void create(Answer answer);
    void update(Answer answer);
    void deleteAnswer(Answer answer);
}
