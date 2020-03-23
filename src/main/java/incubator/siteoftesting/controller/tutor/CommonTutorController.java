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
}
