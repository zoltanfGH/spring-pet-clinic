package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping({"/oups","/oups.html"})
    public String error(){
        return "notimplemented";
    }
}
