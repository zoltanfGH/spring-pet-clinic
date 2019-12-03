package pro.zoltanfekete.springpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pro.zoltanfekete.springpetclinic.services.OwnerService;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/owner","/owner.html"})
    public String ownerList(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/owner";
    }
}
