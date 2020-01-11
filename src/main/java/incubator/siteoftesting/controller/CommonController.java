package incubator.siteoftesting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/common")
public class CommonController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI1");
        return modelAndView;
    }

    @RequestMapping(value = "/index/menu", method = RequestMethod.GET)
    public ModelAndView goToMenu(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI2");
        return modelAndView;
    }

    @RequestMapping(value = "/index/creationt", method = RequestMethod.GET)
    public ModelAndView goToCreationTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI3");
        return modelAndView;
    }

    @RequestMapping(value = "/index/creationu", method = RequestMethod.GET)
    public ModelAndView goToCreationUser(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI4");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statistic", method = RequestMethod.GET)
    public ModelAndView goToStatistic(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI5");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statistictest", method = RequestMethod.GET)
    public ModelAndView goToStatisticTest(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI6");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statseven", method = RequestMethod.GET)
    public ModelAndView goToSeven(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI7");
        return modelAndView;
    }

    @RequestMapping(value = "/index/statee", method = RequestMethod.GET)
    public ModelAndView goToStatEghtn(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI8");
        return modelAndView;
    }

}
