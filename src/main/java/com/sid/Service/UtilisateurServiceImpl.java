package com.sid.Service;


import com.sid.Entity.Utilisateur;
import com.sid.Entity.Classe;
import com.sid.Entity.Niveau;
import com.sid.Repository.ClasseRepository;
import com.sid.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private ClasseRepository classeRepository;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur utilisateur=utilisateurRepository.findById(idUtilisateur).orElse(null);
        Classe classe=classeRepository.findById(codeClasse).orElse(null);
        utilisateur.setClasse(classe);
        utilisateurRepository.save(utilisateur);


    }

    @Override
    public Integer nbUtilisateurParNiveau(Niveau nv) {
        return utilisateurRepository.nbUtilisateurParNiveau(nv);
    }
}
