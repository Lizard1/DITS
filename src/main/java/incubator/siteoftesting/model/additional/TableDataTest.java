package incubator.siteoftesting.model.additional;

import incubator.siteoftesting.model.Test;

import java.util.Objects;

public class TableDataTest {

    private Test test;
    private int countPassed;
    private double percentRight;


    public TableDataTest() {
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getCountPassed() {
        return countPassed;
    }

    public void setCountPassed(int countPassed) {
        this.countPassed = countPassed;
    }

    public double getPercentRight() {
        return percentRight;
    }

    public void setPercentRight(double percentRight) {
        this.percentRight = percentRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDataTest tableDataTest = (TableDataTest) o;
        return countPassed == tableDataTest.countPassed &&
                Double.compare(tableDataTest.percentRight, percentRight) == 0 &&
                Objects.equals(test, tableDataTest.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test, countPassed, percentRight);
    }

    @Override
    public String toString() {
        return "TableDataTest{" +
                "test=" + test +
                ", countPassed=" + countPassed +
                ", percentRight=" + percentRight +
                '}';
    }
}
