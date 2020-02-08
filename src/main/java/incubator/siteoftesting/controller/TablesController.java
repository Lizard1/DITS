package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.Answer;
import incubator.siteoftesting.model.additional.TableData;
import incubator.siteoftesting.model.Test;
import incubator.siteoftesting.service.AnswerService;
import incubator.siteoftesting.service.QuestionService;
import incubator.siteoftesting.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/common/index")
public class TablesController {


    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;


    @RequestMapping(value = "/statistictest", method = RequestMethod.GET)
    public ModelAndView goToStatisticTest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI6");
        return modelAndView;
    }

    @ModelAttribute("table")
    public List<Test>  getTableData(){
        Map<String, TableData> tableMap = new HashMap<>();
        List<Test> tests = testService.getAllTests();
        //Collection<Answer> answers1 = getAnswers();


        return tests;
    }

    private List<Answer> getAnswers() {
        List<Answer> answers = answerService.getAllAnswers();
        int perst = (int)answers.stream().filter(x -> x.getCorrect() == 1).count();
        for (Answer ans: answers) {
            if(ans.getCorrect() == 1){

            }
        }
        return answers;
    }

    @RequestMapping(value = "/statseven", method = RequestMethod.GET)
    public ModelAndView goToSeven() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI7");
        return modelAndView;
    }

    @RequestMapping(value = "/statee", method = RequestMethod.GET)
    public ModelAndView goToStatEghtn() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI8");
        return modelAndView;
    }

}
/*
*
*
    @ModelAttribute("tableMap")
    public Map<String, TableData> getTableData(){
        Map<String, TableData> tableMap = new HashMap<>();
        List<Test> tests = testService.getAllTests();
        //Collection<Answer> answers1 = getAnswers();


        return tableMap;
    }*/