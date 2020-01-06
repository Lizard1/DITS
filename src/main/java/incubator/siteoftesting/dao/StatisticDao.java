package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Statistic;

import java.util.List;

public interface StatisticDao {
    List<Statistic> findAllStatistics();
    Statistic findStatisticById(int id);
    void create(Statistic statistic);
    void update(Statistic statistic);
    void delete(Statistic statistic);
}
