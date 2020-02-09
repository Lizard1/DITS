package incubator.siteoftesting.model.additional;

import incubator.siteoftesting.model.User;

import java.util.Objects;

public class TableDataUser {

    private User user;
    private String nameTest;
    private int countPassed;
    private double percentPassed;

    public TableDataUser() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public int getCountPassed() {
        return countPassed;
    }

    public void setCountPassed(int countPassed) {
        this.countPassed = countPassed;
    }

    public double getPercentPassed() {
        return percentPassed;
    }

    public void setPercentPassed(double percentPassed) {
        this.percentPassed = percentPassed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDataUser that = (TableDataUser) o;
        return countPassed == that.countPassed &&
                Double.compare(that.percentPassed, percentPassed) == 0 &&
                Objects.equals(user, that.user) &&
                Objects.equals(nameTest, that.nameTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, nameTest, countPassed, percentPassed);
    }

    @Override
    public String toString() {
        return "TableDataUser{" +
                "user=" + user +
                ", nameTest='" + nameTest + '\'' +
                ", countPassed=" + countPassed +
                ", percentPassed=" + percentPassed +
                '}';
    }
}
