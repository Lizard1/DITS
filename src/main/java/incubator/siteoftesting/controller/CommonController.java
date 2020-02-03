package incubator.siteoftesting.controller;


import incubator.siteoftesting.model.*;
import incubator.siteoftesting.service.QuestionService;
import incubator.siteoftesting.service.StatisticService;
import incubator.siteoftesting.service.TestService;
import incubator.siteoftesting.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private TestService testService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private StatisticService statisticService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI1");
        return modelAndView;
    }

    @RequestMapping(value = "/index/menu", method = RequestMethod.GET)
    public ModelAndView goToMenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI2");
        return modelAndView;
    }

    @RequestMapping(value = "/index/creationt", method = RequestMethod.GET)
    public ModelAndView goToCreationTest() {
        ModelAndView modelAndView = new ModelAndView("adminUI3", "crForm", new CreationForm());
        return modelAndView;
    }

    @RequestMapping(value = "/index/creationu", method = RequestMethod.GET)
    public ModelAndView goToCreationUser() {
        ModelAndView modelAndView = new ModelAndView("adminUI4", "formOfUser", new UserForm());
        return modelAndView;
    }

    @RequestMapping(value = "/index/statistic", method = RequestMethod.GET)
    public ModelAndView goToStatistic() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI5");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statistictest", method = RequestMethod.GET)
    public ModelAndView goToStatisticTest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI6");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statseven", method = RequestMethod.GET)
    public ModelAndView goToSeven() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI7");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statee", method = RequestMethod.GET)
    public ModelAndView goToStatEghtn() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI8");
        return modelAndView;
    }

    @RequestMapping(value = "/index/creationt/create", method = RequestMethod.POST)
    public ModelAndView getDataForCreation(@ModelAttribute("crForm") CreationForm creationForm, ModelMap model) {
        model.addAttribute("topic", creationForm.getTopicFromCrFrom());
        model.addAttribute("test", creationForm.getTestFromCrForm());
        model.addAttribute("question", creationForm.getQuestionFromCrForm());

        ModelAndView modelAndView = new ModelAndView("adminUI3", "command", creationForm);
        boolean topicLogic = !creationForm.getTopicFromCrFrom().isEmpty();
        boolean testLogic = !creationForm.getTestFromCrForm().isEmpty();
        boolean questionLogic = !creationForm.getQuestionFromCrForm().isEmpty();

        if (questionLogic && testLogic && topicLogic) {
            Question question = new Question();
            question.setDescription(creationForm.getQuestionFromCrForm());
            questionService.createQuestion(question);
        } else if (testLogic && topicLogic) {
            Test test = new Test();
            Topic topic = new Topic();
            topic.setName(creationForm.getTopicFromCrFrom());
            test.setName(creationForm.getTestFromCrForm());
            test.setTopic(topic);
            testService.createTest(test);
        } else if (topicLogic) {
            Topic topic = new Topic();
            topic.setName(creationForm.getTopicFromCrFrom());
            topicService.createTopic(topic);
        }

        return modelAndView;
    }

    @ModelAttribute("roleList")
    public Map<String, String> getRoleList() {
        Map<String, String> roleList = new HashMap<String, String>();
        roleList.put("admin", "Администратор");
        roleList.put("tutor", "Преподаватель");
        roleList.put("user", "Пользователь");
        return roleList;
    }

    @ModelAttribute("topicList")
    public Map<String, String> getTopicList() {
        Map<String, String> topicMap = new HashMap<String, String>();
        List<Topic> topics = topicService.getAllTopics();

        for (Topic t : topics) {
            topicMap.put(String.valueOf(t.getTopicId()), t.getName());
        }
        return topicMap;
    }

  /*  @ModelAttribute("testList")
    public Map<String, String> getTestList() {
        Map<String, String> testMap = new HashMap<String, String>();
        List<Test> tests = testService.getAllTests();

        for (Test t : tests) {
            testMap.put(String.valueOf(t.getTestId()), t.getName());
        }
        return testMap;
    }

    @ModelAttribute("questionList")
    public Map<String, String> getQuestionList() {
        Map<String, String> questionMap = new HashMap<>();
        List<Question> questions = questionService.getAllQuestions();

        for (Question t : questions) {
            questionMap.put(String.valueOf(t.getQuestionId()), t.getDescription());
        }
        return questionMap;
    }*/

    @ModelAttribute("statisticList")
    public Map<String, String> getStatisticsData(){
        Map<String, String> statisticMap = new HashMap<>();
        List<Statistic> statistics = statisticService.getAllStatistics();

        for (Statistic t: statistics) {
            statisticMap.put(String.valueOf(t.getStatisticId()), String.valueOf(t.getStatisticId()));
        }
        return statisticMap;
    }
}