package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    @GetMapping({"/owner","/owner.html"})
    public String ownerList(){
        return "owner";
    }
}
