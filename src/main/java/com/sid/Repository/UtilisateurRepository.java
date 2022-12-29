package com.sid.Repository;

import com.sid.Entity.Utilisateur;
import com.sid.Entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

    @Query("select count(c) from Utilisateur u,Classe c where c.codeClasse=u.classe.codeClasse and c.niveau=:nv")
    public Integer nbUtilisateurParNiveau(@Param("nv")Niveau nv);


}
