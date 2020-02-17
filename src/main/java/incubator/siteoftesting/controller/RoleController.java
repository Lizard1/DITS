//package incubator.siteoftesting.controller;
//
//import incubator.siteoftesting.model.Role;
//import incubator.siteoftesting.service.RoleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/role")
//public class RoleController {
//
//    private RoleService roleService;
//
//    @Autowired
//    public void setRoleService(RoleService roleService) {
//        this.roleService = roleService;
//    }
//
//    @RequestMapping(value = "/allroles", method = RequestMethod.GET)
//    public ModelAndView getAllRoles(){
//        List<Role> roles = roleService.getAllRoles();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("");
//        modelAndView.addObject("###", roles);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/onerole", method = RequestMethod.GET)
//    public ModelAndView getRoleById(@PathVariable("id") int id) {
//            Role role = roleService.getRoleById(id);
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.setViewName("#");
//            modelAndView.addObject("###", role);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/newrole", method = RequestMethod.POST)
//    public ModelAndView addRole(@ModelAttribute("role") Role role) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("#");
//        roleService.create(role);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/editrole", method = RequestMethod.POST)
//    public ModelAndView editRole(@ModelAttribute("role") Role role) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("###");
//        roleService.update(role);
//        return modelAndView;
//    }
//
//    @RequestMapping(value="/deleterole", method = RequestMethod.GET)
//    public ModelAndView deleteRole(@PathVariable("id") int id) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("#");
//        Role role = roleService.getRoleById(id);
//        roleService.deleteRole(role);
//        return modelAndView;
//    }
//}
