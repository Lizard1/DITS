package incubator.siteoftesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String goToMenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminUI2");
     return "denied";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloMenu() {
        return "hello";
    }
}
