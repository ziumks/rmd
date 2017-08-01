package rmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchingDataCont {

    @RequestMapping("/sdata")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        if (name.equals("kang")) {
        	return "searchingData1";
        }
        else if( name.equals("kook")) {
        	return "searchingData2";
        }
        else if( name.equals("dae")) {
        	return "searchingData3";
        }
        else if( name.equals("moo")) {
        	return "searchingData4";
        }


        return "searchingData";
    }

}
