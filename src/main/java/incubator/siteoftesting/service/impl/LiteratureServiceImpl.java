package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.LiteratureDao;
import incubator.siteoftesting.model.Literature;
import incubator.siteoftesting.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class LiteratureServiceImpl implements LiteratureService {

    @Autowired
    private LiteratureDao literatureDao;

    @Override
    @Transactional
    public List<Literature> getAllLiteratures() {
        return literatureDao.findAllLiteratures();
    }

    @Override
    @Transactional
    public Literature getLiteratureById(int id) {
        return literatureDao.findLiteratureById(id);
    }

    @Override
    @Transactional
    public void create(Literature literature) {
        literatureDao.create(literature);
    }

    @Override
    @Transactional
    public void update(Literature literature) {
        literatureDao.update(literature);
    }

    @Override
    @Transactional
    public void deleteLiterature(Literature literature) {
        literatureDao.delete(literature);
    }
}
