package incubator.siteoftesting.model;

public class UserForm extends User{
    private String roleFromForm;
    private String patronymic;
    private String email;

    public String getRoleFromForm() {
        return roleFromForm;
    }

    public void setRoleFromForm(String roleFromForm) {
        this.roleFromForm = roleFromForm;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}