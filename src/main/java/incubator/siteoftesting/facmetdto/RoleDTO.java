package incubator.siteoftesting.facmetdto;

public class RoleDTO implements Model {

    private int roleId;
    private int user;
    private int tutor;
    private int admin;

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


    @Override
    public int getId() {
        return getRoleId();
    }
}
