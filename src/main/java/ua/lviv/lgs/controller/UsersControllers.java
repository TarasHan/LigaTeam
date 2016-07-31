package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.entity.Users;
import ua.lviv.lgs.service.UserService;

/**
 * Created by Kerol on 30.05.2016.
 */
@Controller
public class UsersControllers {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET )
private String newUsers (Model model){
        model.addAttribute("user",new Users());
        return "registration";
    }
@RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    private String createNewUser(@ModelAttribute Users users){
    userService.addUser(users);
    return "redirect:/";
}
@RequestMapping(value = "/myCabinet={id}",method = RequestMethod.GET)
    public String myCabinet(@PathVariable String id, Model model){
    model.addAttribute("qwe",userService.findById(Integer.parseInt(id)));
    return "user";
}
@RequestMapping(value = "/loginpage")
    public String login(){return "login";}
}
