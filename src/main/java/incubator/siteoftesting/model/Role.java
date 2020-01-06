package incubator.siteoftesting.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rule")
public class Role {

    @Id
    @Column(name = "ruleId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Column(name = "usser")
    private int user;

    @Column(name = "tutor")
    private int tutor;

    @Column(name = "admmin")
    private int admin;

    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    private Set<User> userSet;

    public Role() {
    }

    public Role(int user, int tutor, int admin, Set<User> userSet) {
        this.user = user;
        this.tutor = tutor;
        this.admin = admin;
        this.userSet = userSet;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", user=" + user +
                ", tutor=" + tutor +
                ", admin=" + admin +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getTutor() {
        return tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}
