package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.Statistic;
import incubator.siteoftesting.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/statistic")
public class StatisticController {

    private StatisticService statisticService;

    @Autowired
    public void setStatisticService(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @RequestMapping(value = "/getallstats", method = RequestMethod.GET)
    public ModelAndView getAllStats(){
        List<Statistic> statistics = statisticService.getAllStatistics();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        modelAndView.addObject("###", statistics);
        return modelAndView;
    }

    @RequestMapping(value = "/getonestat", method = RequestMethod.GET)
    public ModelAndView getStatById(@PathVariable("id") int id) {
        Statistic statistic = statisticService.getStatisticById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        modelAndView.addObject("###", statistic);
        return modelAndView;
    }

    @RequestMapping(value = "/addnewstat", method = RequestMethod.POST)
    public ModelAndView addStatistic(@ModelAttribute("statistic") Statistic statistic) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        statisticService.create(statistic);
        return modelAndView;
    }

    @RequestMapping(value = "/editstat", method = RequestMethod.POST)
    public ModelAndView editStatistic(@ModelAttribute("statistic") Statistic statistic) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("###");
        statisticService.update(statistic);
        return modelAndView;
    }

    @RequestMapping(value="/deleteonestat", method = RequestMethod.GET)
    public ModelAndView deleteStatistic(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        Statistic statistic = statisticService.getStatisticById(id);
        statisticService.deleteStatistic(statistic);
        return modelAndView;
    }
}
