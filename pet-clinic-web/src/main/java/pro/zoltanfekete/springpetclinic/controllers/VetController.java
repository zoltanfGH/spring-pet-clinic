package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pro.zoltanfekete.springpetclinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets","/vets.html"})
    public String vetList(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/vets";
    }
}
