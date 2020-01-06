package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.StatisticDao;
import incubator.siteoftesting.model.Statistic;
import incubator.siteoftesting.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticDao statisticDao;

    @Override
    @Transactional
    public List<Statistic> getAllStatistics() {
        return statisticDao.findAllStatistics();
    }

    @Override
    @Transactional
    public Statistic getStatisticById(int id) {
        return statisticDao.findStatisticById(id);
    }

    @Override
    @Transactional
    public void create(Statistic statistic) {
        statisticDao.create(statistic);
    }

    @Override
    @Transactional
    public void update(Statistic statistic) {
        statisticDao.update(statistic);
    }

    @Override
    @Transactional
    public void deleteStatistic(Statistic statistic) {
        statisticDao.delete(statistic);
    }
}
