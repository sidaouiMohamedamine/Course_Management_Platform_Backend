package com.sid.Controller;


import com.sid.Entity.Utilisateur;
import com.sid.Service.IUtilisateurService;
import com.sid.Entity.Niveau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    private IUtilisateurService utilisateurService;
    @PostMapping("/ajouterUtilisateur")
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur utilisateur){
       return  utilisateurService.ajouterUtilisateur(utilisateur);
    }


    }
