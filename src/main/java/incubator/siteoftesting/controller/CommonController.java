package incubator.siteoftesting.controller;


import incubator.siteoftesting.model.CreationForm;
import incubator.siteoftesting.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/common")
public class CommonController {


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
        model.addAttribute("topic", creationForm.getTopic());
        model.addAttribute("test", creationForm.getTest());
        model.addAttribute("question", creationForm.getQuestion());

        ModelAndView modelAndView = new ModelAndView();

        if(creationForm.getTopic().toLowerCase().equals("1")){

        }else if(creationForm.getTest().toLowerCase().equals("2")){

        }else if(creationForm.getQuestion().toLowerCase().equals("3")){

        }

        return modelAndView;
    }

    @ModelAttribute("roleList")
    public Map<String, String> getCountryList() {
        Map<String, String> roleList = new HashMap<String, String>();
        roleList.put("admin", "Администратор");
        roleList.put("tutor", "Преподаватель");
        roleList.put("user", "Пользователь");
        return roleList;
    }

    @ModelAttribute("topicList")
    public Map<String, String> getTopicList() {
        Map<String, String> topicList = new HashMap<String, String>();
        topicList.put("t1", "Тема 1");
        topicList.put("t2", "Тема 2");
        topicList.put("t3", "Тема 3");
        topicList.put("t4", "Тема 4");
        return topicList;
    }

    @ModelAttribute("testList")
    public Map<String, String> getTestList() {
        Map<String, String> testList = new HashMap<String, String>();
        testList.put("t1", "Тест 1");
        testList.put("t2", "Тест 2");
        testList.put("t3", "Тест 3");
        testList.put("t4", "Тест 4");
        return testList;
    }

    @ModelAttribute("questionList")
    public Map<String, String> getQuestionList() {
        Map<String, String> questionList = new HashMap<String, String>();
        questionList.put("q1", "Вопрос 1");
        questionList.put("q2", "Вопрос 2");
        questionList.put("q3", "Вопрос 3");
        questionList.put("q4", "Вопрос 4");
        return questionList;
    }
}