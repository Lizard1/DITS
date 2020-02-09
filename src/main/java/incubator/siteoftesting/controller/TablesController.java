package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.Answer;
import incubator.siteoftesting.model.additional.TableDataTest;
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
    public List<TableDataTest> getTableData(){
        List<Test> tests = testService.getAllTests();
        List<TableDataTest> tableDataTestList = new ArrayList<>();

        for (Test t: tests) {
            TableDataTest tableDataTest = new TableDataTest();
            tableDataTest.setTest(t);
            tableDataTest.setCountPassed(0);
            tableDataTest.setPercentRight(getPercentRightAnswers(t));
            tableDataTestList.add(tableDataTest);
        }

        return tableDataTestList;
    }

    private double getPercentRightAnswers(Test test) {
        List<Answer> answers = answerService.getAllAnswers();
        int rightAnswers = (int)answers.stream().filter(x -> x.getCorrect() == 1 && x.getQuestionA().getTest().getTestId() == test.getTestId()).count();
        int certainTestAnswers = (int)answers.stream().filter(x -> x.getQuestionA().getTest().getTestId() == test.getTestId()).count();
        return rightAnswers*100/certainTestAnswers;
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
    public Map<String, TableDataTest> getTableData(){
        Map<String, TableDataTest> tableMap = new HashMap<>();
        List<Test> tests = testService.getAllTests();
        //Collection<Answer> answers1 = getAnswers();


        return tableMap;
    }*/