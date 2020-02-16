package incubator.siteoftesting.dao.additional;

import incubator.siteoftesting.model.additional.TableDataTest;

import java.util.List;

public interface TableDataTestDao {
    List<TableDataTest> findDataForTests(int id);
}
