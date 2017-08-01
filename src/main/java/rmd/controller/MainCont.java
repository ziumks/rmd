package rmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCont {
    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("api", "&apiKey=FA38BC92-346A-354B-B774-8BF75ACD9D3A");
        return "tmain";
    }
}
