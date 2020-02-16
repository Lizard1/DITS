package incubator.siteoftesting.controller;


import incubator.siteoftesting.model.*;
import incubator.siteoftesting.model.additional.CreationForm;
import incubator.siteoftesting.model.additional.UserForm;
import incubator.siteoftesting.service.QuestionService;
import incubator.siteoftesting.service.StatisticService;
import incubator.siteoftesting.service.TestService;
import incubator.siteoftesting.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping("/common")
public class CommonController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private TestService testService;

    @Autowired
    private TopicService topicService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI1");
        return modelAndView;
    }

    @RequestMapping(value = "/index/menu", method = RequestMethod.GET)
    public ModelAndView goToMenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
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
    public Map<String, Topic> getTopicList() {
        Map<String, Topic> topicMap = new HashMap<String, Topic>();
        List<Topic> topics = topicService.getAllTopics();

        for (Topic top : topics) {
            topicMap.put(String.valueOf(top.getTopicId()), top);
        }
        return topicMap;
    }

    @ModelAttribute("testList")
    public Map<String, Test> getTestList() {
        Map<String, Test> testMap = new HashMap<String, Test>();
        List<Test> tests = testService.getAllTests();

        for (Test tes : tests) {
            testMap.put(String.valueOf(tes.getTestId()), tes);
        }
        return testMap;
    }

    @ModelAttribute("questionList")
    public Map<String, Question> getQuestionList() {
        Map<String, Question> questionMap = new HashMap<>();
        List<Question> questions = questionService.getAllQuestions();

        for (Question t : questions) {
            questionMap.put(String.valueOf(t.getQuestionId()), t);
        }
        return questionMap;
    }

//------------------------------------------------------------------------------

    @GetMapping(value = "/")
    public String homePage() {
        return "login";
    }

    @GetMapping(value = "/admin")
    public String adminPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "admin";
    }

   /* @GetMapping(value = "/user")
    public String userPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "User/user";
    }

    @GetMapping(value = "/tutor")
    public String tutorPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "Tutor/tutor";
    }*/

    @GetMapping(value = "/Access_Denied")
    public String accessDenied(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "Access_Denied";
    }

    @GetMapping(value = "/accessDenied")
    public String anotherDenied(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "Access_Denied";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    static String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}