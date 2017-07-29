package rmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*********
 *
 * 2017.07.26
 * 안재열
 * 관제망 관리를 기능의 뷰와 데이터 조작을 위한 컨트롤 클래스
 *
 * ********/

@Controller
public class MListCont {
    @RequestMapping("/mlist")
    public String main(Model model) {
        return "mList";
    }
}
