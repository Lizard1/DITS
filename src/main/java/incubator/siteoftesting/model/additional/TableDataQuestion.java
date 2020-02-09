package incubator.siteoftesting.model.additional;

import incubator.siteoftesting.model.Question;

import java.util.Objects;

public class TableDataQuestion {

    private Question question;
    private int countPassed;
    private double percentRight;

    public TableDataQuestion() {
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getCountPassed() {
        return countPassed;
    }

    public void setCountPassed(int countPassed) {
        this.countPassed = countPassed;
    }

    public double getPercentRight() {
        return percentRight;
    }

    public void setPercentRight(double percentRight) {
        this.percentRight = percentRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDataQuestion that = (TableDataQuestion) o;
        return countPassed == that.countPassed &&
                Double.compare(that.percentRight, percentRight) == 0 &&
                Objects.equals(question, that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, countPassed, percentRight);
    }

    @Override
    public String toString() {
        return "TableDataQuestion{" +
                "question=" + question +
                ", countPassed=" + countPassed +
                ", percentRight=" + percentRight +
                '}';
    }
}
