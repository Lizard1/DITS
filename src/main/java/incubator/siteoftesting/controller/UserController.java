package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.User;
import incubator.siteoftesting.model.UserForm;
import incubator.siteoftesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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


    @RequestMapping(value="/add-new-order", method=RequestMethod.POST)
    public String addNewOrder(@RequestParam(value="role") String role,
                              @RequestParam(value="firstName") String firstName,
                              @RequestParam(value="surname") String surname,
                              @RequestParam(value="patronymic") String patronymic,
                              @RequestParam(value="logIn") String logIn,
                              @RequestParam(value="password") String password,
                              @RequestParam(value="email") String email){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(surname);
        user.setLogin(logIn);
        user.setPassword(password);
        return "redirect:/common/index/creationu";
    }

/*
    @RequestMapping(value = "/adminUI4", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("adminUI4", "command", new UserForm());
    }
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") UserForm userForm, ModelMap model) {
        model.addAttribute("name", userForm.getName());
        model.addAttribute("surname", userForm.getSurname());
        model.addAttribute("patronymic", userForm.getPatronymic());

        return "succ";
    }

*/
    @RequestMapping(value = "/getallusers", method = RequestMethod.GET)
    public ModelAndView getAllUsers(){
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

    /*@RequestMapping(value = "/addnewuser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user) { //@RequrestPara / @requestbody
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/"); ///common/index/creationu
        userService.create(user);
        return modelAndView;
    }*/

    /*@RequestMapping(value = "/userform", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("succ", "userform", new UserForm());
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("userform")UserForm userForm,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", userForm.getName());
        model.addAttribute("surname", userForm.getSurname());
        model.addAttribute("logIn", userForm.getLogIn());
        return "adminUI1";
    }*/



    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user) { //@RequrestPara / @requestbody
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/"); ///common/index/creationu
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       // userService.create(user);
        return modelAndView;
    }


    @RequestMapping(value = "editUser", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("###");
        userService.update(user);
        return modelAndView;
    }

    @RequestMapping(value="/deleteoneuser", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("#");
        User user = userService.getUserById(id);
        userService.deleteUser(user);
        return modelAndView;
    }
}


