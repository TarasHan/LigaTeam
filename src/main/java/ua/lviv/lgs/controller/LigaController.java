package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.entity.Liga;
import ua.lviv.lgs.service.LigaService;

/**
 * Created by Kerol on 06.06.2016.
 */
@Controller
public class LigaController {
    @Autowired
    private LigaService ligaService;

    @RequestMapping(value = "/newLiga", method = RequestMethod.GET)
    private String newLiga(Model model){
        return "newLiga";
    }
    @RequestMapping(value = "/createNewLiga",method = RequestMethod.POST)
    private  String createNewLiga(@RequestParam(value = "ligaName")String ligaName  ){
        return "redirect:/";
    }
}
