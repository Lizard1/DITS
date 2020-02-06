package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Link;

import java.util.List;

public interface LinkDao {
    List<Link> findAllLinks();
    Link findLinkById(int id);
    void create(Link link);
    void update(Link link);
    void delete(Link link);
}
