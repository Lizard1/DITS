package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "statistic")
public class Statistic {

    @Id
    @Column( name = "statisticId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statisticsId;

    @Temporal(TemporalType.DATE)
    @Column(name = "datte")
    private Date date;

    @Column(name = "correct")
    private boolean correct;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User userStat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionId")
    private Question question;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "testId")
    private Test testS;

    public Statistic() {
    }

    public int getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(int statisticsId) {
        this.statisticsId = statisticsId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public User getUserStat() {
        return userStat;
    }

    public void setUserStat(User userStat) {
        this.userStat = userStat;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Test getTestS() {
        return testS;
    }

    public void setTestS(Test testS) {
        this.testS = testS;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "date=" + date +
                ", correct=" + correct +
                ", testS=" + testS +
                '}';
    }
}
