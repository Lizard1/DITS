package incubator.siteoftesting.model.additional;

import incubator.siteoftesting.model.Answer;
import incubator.siteoftesting.model.Test;

import java.util.List;

public class TableData {

    private Test test;
    private Answer answer;
    List<Answer> answers;

    public TableData() {
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "test=" + test +
                ", answer=" + answer +
                ", answers=" + answers +
                '}';
    }
}
