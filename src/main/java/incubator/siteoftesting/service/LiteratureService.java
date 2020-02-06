package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Literature;

import java.util.List;

public interface LiteratureService {
    List<Literature> getAllLiteratures();
    Literature getLiteratureById(int id);
    void create(Literature literature);
    void update(Literature literature);
    void deleteLiterature(Literature literature);
}
