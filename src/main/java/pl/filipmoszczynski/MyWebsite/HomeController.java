package pl.filipmoszczynski.MyWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("pro", true);

        return "index.html";
    }
}
