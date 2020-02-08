package incubator.siteoftesting.model.additional;

public class CreationForm {
    private String topicFromCrFrom;
    private String testFromCrForm;
    private String questionFromCrForm;

    public CreationForm() {
    }

    public CreationForm(String topic, String test, String question) {
        this.topicFromCrFrom = topic;
        this.testFromCrForm = test;
        this.questionFromCrForm = question;
    }

    public String getTopicFromCrFrom() {
        return topicFromCrFrom;
    }

    public void setTopicFromCrFrom(String topicFromCrFrom) {
        this.topicFromCrFrom = topicFromCrFrom;
    }

    public String getTestFromCrForm() {
        return testFromCrForm;
    }

    public void setTestFromCrForm(String testFromCrForm) {
        this.testFromCrForm = testFromCrForm;
    }

    public String getQuestionFromCrForm() {
        return questionFromCrForm;
    }

    public void setQuestionFromCrForm(String questionFromCrForm) {
        this.questionFromCrForm = questionFromCrForm;
    }
}
