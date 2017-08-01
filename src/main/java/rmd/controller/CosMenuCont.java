package rmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CosMenuCont {

    @RequestMapping("/cos")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        if (name.equals("kang")) {
        	return "cosMenu1";
        }
        else if( name.equals("kook")) {
        	return "cosMenu2";
        }
        else if( name.equals("dae")) {
        	return "cosMenu3";
        }
        else if( name.equals("moo")) {
        	return "cosMenu4";
        }

        return "cosMenu";
    }

}
