package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();
    Question getQuestionById(int id);
    void createQuestion(Question question);
    void updateQuestion(Question question);
    void deleteQuestion(Question question);
}
