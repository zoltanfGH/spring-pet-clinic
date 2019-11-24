package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping({"/vet","/vet.html"})
    public String vetList(){
        return "vet";
    }
}
