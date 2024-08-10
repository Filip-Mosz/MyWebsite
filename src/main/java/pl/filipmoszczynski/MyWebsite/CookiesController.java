package pl.filipmoszczynski.MyWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CookiesController {

    @RequestMapping("/cookies")
    public String getCookies(Model model){

        return "cookies.html";
    }
}
