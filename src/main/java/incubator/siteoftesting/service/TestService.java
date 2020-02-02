package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Test;

import java.util.List;

public interface TestService {
    List<Test> getAllTests();
    Test getTestById(int id);
    void createTest(Test test);
    void updateTest(Test test);
    void deleteTest(Test test);
}
