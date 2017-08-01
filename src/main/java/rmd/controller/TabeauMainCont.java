package rmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TabeauMainCont {
    @RequestMapping("/tmain")
    public String main(Model model) {
        return "tmain";
    }
}
