package com.sid.Service;

import com.sid.Entity.Utilisateur;
import com.sid.Entity.Niveau;

public interface IUtilisateurService {
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
    public void affecterUtilisateurClasse(Integer idUtilisateur,Integer codeClasse);
    public Integer nbUtilisateurParNiveau(Niveau nv);
}
