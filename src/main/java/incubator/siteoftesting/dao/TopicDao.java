package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Topic;

import java.util.List;

public interface TopicDao {
    List<Topic> findAllTopics();
    Topic findTopicById(int id);
    void create(Topic topic);
    void update(Topic topic);
    void delete(Topic topic);
}
