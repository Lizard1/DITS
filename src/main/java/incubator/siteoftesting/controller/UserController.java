package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.User;
import incubator.siteoftesting.model.UserForm;
import incubator.siteoftesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(name = "/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/getallusers", method = RequestMethod.GET)
    public ModelAndView getAllUsers() {
        List<User> users = userService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("");
        modelAndView.addObject("###", users);
        return modelAndView;
    }

    @RequestMapping(value = "/getoneuser", method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        modelAndView.addObject("###", user);
        return modelAndView;
    }

    @RequestMapping(value = "editUser", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("###");
        userService.update(user);
        return modelAndView;
    }

    @RequestMapping(value = "/deleteoneuser", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        User user = userService.getUserById(id);
        userService.deleteUser(user);
        return modelAndView;
    }
}