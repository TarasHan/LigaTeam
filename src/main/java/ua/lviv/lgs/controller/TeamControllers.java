package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.service.TeamService;

/**
 * Created by Kerol on 30.05.2016.
 */
@Controller
public class TeamControllers {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/newTeam", method = RequestMethod.GET)
    public String newTeam(Model model){
        return "newTeam";
    }

    /*@RequestMapping(value = "/createNewTeam", method = RequestMethod.POST)
    public String createNewTeam(@RequestParam(value = "name")String name,@RequestParam(value = "win")int win,@RequestParam(value = "draw")int draw,@RequestParam(value = "lose")int lose){
        teamService.addTeam(name,win,draw,lose);
    }
    */
}
