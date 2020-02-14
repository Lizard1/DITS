package incubator.siteoftesting.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @Column(name = "testId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "test")
    private Set<Question> questions;

    @OneToMany(mappedBy = "testS")
    private Set<Statistic> statistics;

    public Test() {}

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Set<Statistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(Set<Statistic> statistics) {
        this.statistics = statistics;
    }
}
