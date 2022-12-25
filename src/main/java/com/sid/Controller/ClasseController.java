package com.sid.Controller;


import com.sid.Entity.Classe;
import com.sid.Service.IClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classe")
public class ClasseController {
    @Autowired
    private IClasseService classeService;
    @PostMapping("/ajouterClasse")
    public Classe ajouteClasse(@RequestBody Classe c){
        return classeService.ajouterClasse(c);
    }
}
