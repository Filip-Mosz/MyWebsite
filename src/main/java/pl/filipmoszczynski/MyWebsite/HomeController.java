package pl.filipmoszczynski.MyWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(){

        return "index.html";
    }
}
