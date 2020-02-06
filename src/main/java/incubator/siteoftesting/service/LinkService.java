package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Link;

import java.util.List;

public interface LinkService {
    List<Link> getAllLinks();
    Link getLinkById(int id);
    void create(Link link);
    void update(Link link);
    void deleteLink(Link link);
}
