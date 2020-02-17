package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.*;
import incubator.siteoftesting.model.additional.TableDataQuestion;
import incubator.siteoftesting.model.additional.TableDataTest;
import incubator.siteoftesting.model.additional.TableDataUser;
import incubator.siteoftesting.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class TablesController {

    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Autowired
    private StatisticService statisticService;

    @RequestMapping(value = "/statistictest", method = RequestMethod.GET)
    public ModelAndView goToStatisticTest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI6");
        return modelAndView;
    }

    @ModelAttribute("table")
    public List<TableDataTest> getTableData() {
        List<Test> tests = testService.getAllTests();
        List<TableDataTest> tableDataTestList = new ArrayList<>();
        for (Test t : tests) {
            TableDataTest tableDataTest = new TableDataTest();
            tableDataTest.setTest(t);
            tableDataTest.setCountPassed(getCountOfTimePassedTests(t));
            tableDataTest.setPercentRight(getPercentRightAnswersTest(t));
            tableDataTestList.add(tableDataTest);
        }

        return tableDataTestList;
    }

    @ModelAttribute("tableQuestion")
    public List<TableDataQuestion> getTableDataQuestion() {
        List<Question> questions = questionService.getAllQuestions();
        List<TableDataQuestion> tableDataQuestions = new ArrayList<>();
        for (Question q : questions) {
            TableDataQuestion tableDataQuestion = new TableDataQuestion();
            tableDataQuestion.setQuestion(q);
            tableDataQuestion.setCountPassed(getCountOfTimePassedQuestions(q));
            tableDataQuestion.setPercentRight(getPercentRightAnswersQuestion(q));
            tableDataQuestions.add(tableDataQuestion);
        }
        return tableDataQuestions;
    }

    @ModelAttribute("tableDataUser")
    public List<TableDataUser> getTableDataUser() {
        List<User> users = userService.getAllUsers();
        List<TableDataUser> tableDataUsers = new ArrayList<>();
        for (User u : users) {
            TableDataUser tableDataUser = new TableDataUser();
            tableDataUser.setUser(u);
            tableDataUser.setNameTest(getNameTestForUser(u));
            tableDataUser.setCountPassed(getCountOfTimePassedTestsByUser(u));
            tableDataUser.setPercentPassed(getPercentRightAnswersUser(u));
            tableDataUsers.add(tableDataUser);
        }
        return tableDataUsers;
    }

    public int getCountOfTimePassedQuestions(Question q) {
        List<Statistic> statistics = statisticService.getAllStatistics();
        int count = (int) statistics.stream().filter(s -> s.getQuestion().getQuestionId() == q.getQuestionId()).count();
        return count;
    }

    public int getCountOfTimePassedTests(Test t) {
        List<Statistic> statistics = statisticService.getAllStatistics();
        int count = (int) statistics.stream().filter(s -> s.getTestS().getTestId() == t.getTestId()).count();
        return count;
    }


    public int getCountOfTimePassedTestsByUser(User u) {
        List<Statistic> stats = statisticService.getAllStatistics().stream().filter(s -> s.getUserStat().getUserId() == u.getUserId()).collect(Collectors.toList());
        return stats.stream().collect(Collectors.groupingBy(Statistic::getTestS, Collectors.counting())).size();
    }

    private String getNameTestForUser(User user) {
        List<Statistic> statistics = statisticService.getAllStatistics();
        Statistic statistic = statistics.stream().filter(s -> s.getUserStat().getUserId() == user.getUserId()).findFirst().orElse(new Statistic());
        String str = statistic.getQuestion().getTest().getName();
        return str;
    }

    private double getPercentRightAnswersUser(User user) {
        List<Statistic> statistics = statisticService.getAllStatistics();
        int rightAnswers = (int) statistics.stream().filter(s -> s.isCorrect() && s.getUserStat().getUserId() == user.getUserId()).count();
        int certainQuestionAnswers = (int) statistics.stream().map(s -> s.getQuestion().getQuestionId()).count();
        return rightAnswers * 100 / certainQuestionAnswers;
    }

    private double getPercentRightAnswersQuestion(Question question) {
        List<Statistic> statistics = statisticService.getAllStatistics();
        int rightAnswers = (int) statistics.stream().filter(s -> s.isCorrect() && s.getQuestion().getQuestionId() == question.getQuestionId()).count();
        int certainQuestionAnswers = (int) statistics.stream().filter(s -> s.getQuestion().getQuestionId() == question.getQuestionId()).count();
        return rightAnswers * 100 / certainQuestionAnswers;
    }

    private double getPercentRightAnswersTest(Test test) {
        List<Answer> answers = answerService.getAllAnswers();
        int rightAnswers = (int) answers.stream().filter(x -> x.getCorrect() == 1 && x.getQuestionA().getTest().getTestId() == test.getTestId()).count();
        int certainTestAnswers = (int) answers.stream().filter(x -> x.getQuestionA().getTest().getTestId() == test.getTestId()).count();
        return rightAnswers * 100 / certainTestAnswers;
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
