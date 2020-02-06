package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Literature;

import java.util.List;

public interface LiteratureDao {
    List<Literature> findAllLiteratures();
    Literature findLiteratureById(int id);
    void create(Literature literature);
    void update(Literature literature);
    void delete(Literature literature);
}
