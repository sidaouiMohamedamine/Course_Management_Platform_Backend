package com.sid.Repository;

import com.sid.Entity.Specialite;
import com.sid.Entity.CoursClassroom;
import com.sid.Entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;

@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom,Integer> {

    @Query("select c.codeClasse from Classe c where c.codeClasse=:codeClasse")
    Integer findCodeClasse(@PathParam("codeClasse")Integer codeClasse);
    @Query("SELECT SUM(cc.nbHeures) FROM CoursClassroom cc WHERE cc.specialite =:specialite AND cc.classe.niveau = :niveau")
    Integer nbHeuresParSpecialiteEtdNiveau(@Param("specialite") Specialite specialite, @Param("niveau") Niveau niveau);

}
