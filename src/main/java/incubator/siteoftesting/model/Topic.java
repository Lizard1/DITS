package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @Column(name = "topicId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;
    @Column(name = "desccription")
    private String description;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "topic")
    private Set<Test> tests;

    public Topic() {
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicId=" + topicId +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
