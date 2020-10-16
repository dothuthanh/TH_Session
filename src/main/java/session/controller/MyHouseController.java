package session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import session.model.MyHouse;

@Controller
@SessionAttributes("myhouse")
public class MyHouseController {
    @ModelAttribute("myhouse")
    public MyHouse setUpcount() {
        return new MyHouse();
    }
    @GetMapping("/")
    public String grt(@ModelAttribute("myhouse") MyHouse myHouse) {
        myHouse.increment();
        return "index";
    }

}
