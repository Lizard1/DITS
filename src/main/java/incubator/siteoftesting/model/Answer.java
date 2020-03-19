package incubator.siteoftesting.model;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @Column(name = "description")
    private String description;

    @Column(name = "correct")
    private byte correct;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionId")
    private Question questionA;

    public int ifCorrect() {
        if (correct != 0 || correct < 0) {
            return 1;
        } else return 0;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getCorrect() {
        return correct;
    }

    public void setCorrect(byte correct) {
        this.correct = correct;
    }

    public Question getQuestionA() {
        return questionA;
    }

    public void setQuestionA(Question questionA) {
        this.questionA = questionA;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", description='" + description + '\'' +
                ", correct=" + correct +
                '}';
    }
}
