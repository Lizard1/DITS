package incubator.siteoftesting.model;

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

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
