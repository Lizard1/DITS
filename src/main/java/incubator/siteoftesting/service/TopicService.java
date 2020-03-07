package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Topic;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TopicService {
    List<Topic> getAllTopics();
    Topic getTopicById(int id);
    void createTopic(Topic topic);
    void updateTopic(Topic topic);
    void deleteTopic(Topic topic);
}
