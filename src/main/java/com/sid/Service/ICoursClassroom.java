package com.sid.Service;

import com.sid.Entity.CoursClassroom;
import com.sid.Entity.Niveau;
import com.sid.Entity.Specialite;

public interface ICoursClassroom {
    public CoursClassroom ajouterCoursClassroom(CoursClassroom c,Integer codeClasse);
    public void desaffecterCoursClassroomClasse(Integer idCours);
    public void archiverCoursClassrooms();
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv);







}
