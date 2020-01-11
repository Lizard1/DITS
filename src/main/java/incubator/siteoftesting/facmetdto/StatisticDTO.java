package incubator.siteoftesting.facmetdto;

import java.util.Date;

public class StatisticDTO implements Model {

    private int statisticsId;
    private Date date;
    private boolean correct;

    public int getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(int statisticsId) {
        this.statisticsId = statisticsId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public int getId() {
        return getId();
    }
}
