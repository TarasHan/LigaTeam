package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.entity.Nation;
import ua.lviv.lgs.entity.Users;
import ua.lviv.lgs.service.NationService;
import ua.lviv.lgs.service.UserService;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

/**
 * Created by Kerol on 30.05.2016.
 */
@Controller
public class HomeController {

    @Autowired
    private NationService nationService;
    @Autowired
    private  UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String home(HttpSession httpSession, Principal principal){
        if(principal==null){
            return "redirect:/loginpage";
        }else {
            httpSession.setAttribute("loginedUser",userService.findById(Integer.parseInt(principal.getName())));
            return "home";
        }
    }
/*
   @RequestMapping(value = "/showAllUsers",method = RequestMethod.GET)
    public String showAllUsrs(Model model){
        List<Users>usersList = userService.findAllUser();
        model.addAllAttributes("user",usersList);
        return "allUsers";
    }
    */
    @RequestMapping(value = "showAllNations",method = RequestMethod.GET)
    public String showAllNations(Model model){
        List<Nation>nationList=nationService.findAllNation();
      model.addAttribute("nation", nationList);
        return "allNations";
    }

}
