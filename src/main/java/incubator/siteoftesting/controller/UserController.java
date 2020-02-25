package incubator.siteoftesting.controller;

import incubator.siteoftesting.model.Role;
import incubator.siteoftesting.model.User;
import incubator.siteoftesting.model.additional.UserForm;
import incubator.siteoftesting.service.UserService;
import incubator.siteoftesting.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/addnewuser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("formOfUser") UserForm userForm, ModelMap model, BindingResult result) {
        model.addAttribute("role", userForm.getRole());
        model.addAttribute("firstName", userForm.getFirstName());
        model.addAttribute("lastName", userForm.getLastName());
        model.addAttribute("patronymic", userForm.getPatronymic());
        model.addAttribute("login", userForm.getLogin());
        model.addAttribute("password", userForm.getPassword());
        model.addAttribute("email", userForm.getEmail());

        ModelAndView modelAndView = new ModelAndView("adminUI4", "command", userForm);
        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setLogin(userForm.getLogin());
        user.setPassword(userForm.getPassword());
        user.setRole(setRole(userForm.getRoleFromForm()));

        userValidator.validate(user, result);
        userService.create(user);
        return modelAndView;
    }

    private Role setRole(String role){
        Role roleForUser;
        if(role.toLowerCase().equals("admin")){
            roleForUser = new Role( 0, 0, 1);
        }else if(role.toLowerCase().equals("tutor")){
            roleForUser = new Role(0, 1, 0);
        }else{
            roleForUser = new Role( 1, 0, 0);
        }
        return roleForUser;
    }
}