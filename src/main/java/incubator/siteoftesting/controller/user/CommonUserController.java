package incubator.siteoftesting.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonUserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String goToUser() {
        return "User/user";
    }

    @RequestMapping(value = "/user/chooseTest", method = RequestMethod.GET)
    public String chooseTest() {
        return "User/user";
    }

    @RequestMapping(value = "/user/personalStatistic", method = RequestMethod.GET)
    public String getPersonalStat() {
        return "User/user";
    }

}
