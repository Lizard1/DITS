package incubator.siteoftesting.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AuthController {

    @GetMapping("/")
    public String toHello(){
        return "redirect:/login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(name = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("errorAuth", true);
        }
        return "adminUI1";
    }
}
