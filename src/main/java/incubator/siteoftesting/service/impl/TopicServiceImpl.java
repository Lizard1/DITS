package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.TopicDao;
import incubator.siteoftesting.model.Topic;
import incubator.siteoftesting.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Override
    @Transactional
    public List<Topic> getAllTopics() {
        return  topicDao.findAllTopics();
    }

    @Override
    @Transactional
    public Topic getTopicById(int id) {
        return topicDao.findTopicById(id);
    }

    @Override
    @Transactional
    public void createTopic(Topic topic) {
        topicDao.create(topic);
    }

    @Override
    @Transactional
    public void updateTopic(Topic topic) {
        topicDao.update(topic);
    }

    @Override
    @Transactional
    public void deleteTopic(Topic topic) {
        topicDao.delete(topic);
    }
}
