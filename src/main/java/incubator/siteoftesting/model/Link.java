package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "link")
public class Link {

    @Id
    @Column(name = "linkId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int linkId;

    @Column(name = "link")
    private String link;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "literatureId")
    private Literature  literature;

    public Link() {
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "linkId=" + linkId +
                ", link='" + link + '\'' +
                '}';
    }
}
