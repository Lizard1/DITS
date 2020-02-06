package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.LinkDao;
import incubator.siteoftesting.model.Link;
import incubator.siteoftesting.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkDao linkDao;

    @Override
    @Transactional
    public List<Link> getAllLinks() {
        return linkDao.findAllLinks();
    }

    @Override
    @Transactional
    public Link getLinkById(int id) {
        return linkDao.findLinkById(id);
    }

    @Override
    @Transactional
    public void create(Link link) {
        linkDao.create(link);
    }

    @Override
    @Transactional
    public void update(Link link) {
        linkDao.update(link);
    }

    @Override
    @Transactional
    public void deleteLink(Link link) {
        linkDao.delete(link);
    }
}
