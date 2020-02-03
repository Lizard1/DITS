package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Date;
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

    public Statistic() {
    }

    public Statistic(Date date, boolean correct) {
        this.date = date;
        this.correct = correct;
    }

    public int getStatisticId() {
        return statisticsId;
    }

    public void setStatisticId(int statisticId) {
        this.statisticsId = statisticId;
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

}
