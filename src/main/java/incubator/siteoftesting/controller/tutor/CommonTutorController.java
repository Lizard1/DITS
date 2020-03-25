package incubator.siteoftesting.controller.tutor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonTutorController {

    @RequestMapping(value = "/tutor", method = RequestMethod.GET)
    public String goToMenu() {
        return "Tutor/tutormenu";
    }


    @RequestMapping(value = "/tutor/edittopictest", method = RequestMethod.GET)
    public String gotoedit() {
        return "Tutor/tutor2";
    }

    @RequestMapping(value = "/tutor/editquans", method = RequestMethod.GET)
    public String gotoEditQA() {
        return "Tutor/tutor3";
    }

    @RequestMapping(value = "/tutor/statis", method = RequestMethod.GET)
    public String goToStatistic() {
        return "Tutor/tutor4";
    }


    @RequestMapping(value = "/tutor/statitest", method = RequestMethod.GET)
    public String gotToStatTest() {
        return "Tutor/tutor5";
    }

    @RequestMapping(value = "/tutor/statq", method = RequestMethod.GET)
    public String goToStatQ() {
        return "Tutor/tutor6";
    }

    @RequestMapping(value = "/tutor/statu", method = RequestMethod.GET)
    public String goToStatU() {
        return "Tutor/tutor7";
    }

}
