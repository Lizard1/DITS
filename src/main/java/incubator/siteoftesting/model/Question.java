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

    @OneToMany(mappedBy = "questionL")
    private Set<Literature> literatureSet;

    @OneToMany(mappedBy = "questionA")
    private Set<Answer> answers;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "testId")
    private Test test;

    public Question(){}

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

    public Set<Statistic> getStatisticsQuestions() {
        return statisticsQuestions;
    }

    public void setStatisticsQuestions(Set<Statistic> statisticsQuestions) {
        this.statisticsQuestions = statisticsQuestions;
    }

    public Set<Literature> getLiteratureSet() {
        return literatureSet;
    }

    public void setLiteratureSet(Set<Literature> literatureSet) {
        this.literatureSet = literatureSet;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", description='" + description + '\'' +
                '}';
    }
}
