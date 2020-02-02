package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.TestDao;
import incubator.siteoftesting.model.Test;
import incubator.siteoftesting.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public List<Test> getAllTests() {
        return testDao.findAllTests();
    }

    @Override
    @Transactional
    public Test getTestById(int id) {
        return testDao.findTestById(id);
    }

    @Override
    @Transactional
    public void createTest(Test test) {
        testDao.create(test);
    }

    @Override
    @Transactional
    public void updateTest(Test test) {
        testDao.update(test);
    }

    @Override
    @Transactional
    public void deleteTest(Test test) {
        testDao.delete(test);
    }
}
