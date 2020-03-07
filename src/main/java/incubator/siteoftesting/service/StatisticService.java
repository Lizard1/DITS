package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Statistic;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StatisticService {
    List<Statistic> getAllStatistics();
    Statistic getStatisticById(int id);
    void create(Statistic statistic);
    void update(Statistic statistic);
    void deleteStatistic(Statistic statistic);
}
