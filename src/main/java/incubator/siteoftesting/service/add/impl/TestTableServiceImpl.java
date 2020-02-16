package incubator.siteoftesting.service.add.impl;

import incubator.siteoftesting.dao.additional.TableDataTestDao;
import incubator.siteoftesting.service.add.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestTableServiceImpl implements TestTableService {

    @Autowired
    private TableDataTestDao tableDataTestDao;

    @Override
    @Transactional
    public int getnumber(int id) {
        tableDataTestDao.findDataForTests(id);
        return 0;
    }
}
