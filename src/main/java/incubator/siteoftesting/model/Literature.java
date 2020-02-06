package incubator.siteoftesting.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "literature")
public class Literature {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int literatureId;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "literature")
    private Set<Link> links;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionId")
    private Question questionL;

    public Literature() {
    }

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Link> getLinks() {
        return links;
    }

    public void setLinks(Set<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "literatureId=" + literatureId +
                ", description='" + description + '\'' +
                '}';
    }
}
