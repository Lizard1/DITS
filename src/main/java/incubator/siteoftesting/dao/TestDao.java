package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Test;

import java.util.List;

public interface TestDao {
    List<Test> findAllTests();
    Test findTestById(int id);
    void create(Test test);
    void update(Test test);
    void delete(Test test);
}
