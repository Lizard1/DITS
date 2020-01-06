package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @Column(name = "questionId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "question")
    private Set<Statistic> statisticsQuestions;

    public Question(String description) {
        this.description = description;
    }

    public Question() {
    }

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
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", description='" + description + '\'' +
                '}';
    }
}
