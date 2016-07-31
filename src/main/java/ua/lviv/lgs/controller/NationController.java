package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.service.NationService;

/**
 * Created by Kerol on 30.05.2016.
 */
@Controller
public class NationController {
    @Autowired
    private NationService nationService;

    @RequestMapping(value = "/newNation",method = RequestMethod.GET)
    public String newNation (Model model){
        return "newNation";
    }

    @RequestMapping(value = "/createNewNation",method = RequestMethod.POST)
    public String createNation(@RequestParam(value = "nameNation")String nameNation){
        nationService.addNation(nameNation);
        return "redirect:/";
    }
}
