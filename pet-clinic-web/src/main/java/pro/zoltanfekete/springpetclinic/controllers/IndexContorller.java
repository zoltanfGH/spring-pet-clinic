package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexContorller {

    @GetMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
