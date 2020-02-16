package incubator.siteoftesting.dao.additional;

import incubator.siteoftesting.model.additional.TableDataUser;

import java.util.List;

public interface TableDataUserDao {
    List<TableDataUser> findDataForUsers();
}
