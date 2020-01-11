package incubator.siteoftesting.facmetdto;

public class QuestionDTO implements Model {

    private int questionId;
    private String description;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getId() {
        return getQuestionId();
    }
}
