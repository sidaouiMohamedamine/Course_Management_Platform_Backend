package com.sid.Service;


import com.sid.Entity.Classe;
import com.sid.Entity.CoursClassroom;
import com.sid.Entity.Niveau;
import com.sid.Entity.Specialite;
import com.sid.Repository.ClasseRepository;
import com.sid.Repository.CoursClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursClassroomServiceImpl implements ICoursClassroom{

    @Autowired
    private CoursClassroomRepository coursClassroomRepository;
    @Autowired
    private ClasseRepository classeRepository;


    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom c, Integer codeClasse) {
        Classe classe=classeRepository.findById(codeClasse).orElse(null);
        CoursClassroom coursClass=coursClassroomRepository.save(c);
        coursClass.setClasse(classe);
        return coursClass;
    }

    @Override
    public void desaffecterCoursClassroomClasse(Integer idCours) {
        CoursClassroom coursClassroom=coursClassroomRepository.findById(idCours).orElse(null);
        coursClassroom.setClasse(null);
    }
    //@Scheduled(fixedDelay = 60000)
    public void archiverCoursClassrooms()
    {
        List<CoursClassroom> ccs= coursClassroomRepository.findAll();

        for (CoursClassroom coursClassroom : ccs) {
            coursClassroom.setArchive(true);
            coursClassroomRepository.save(coursClassroom);
        }
    }
    @Override
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv)
    {
        return coursClassroomRepository.nbHeuresParSpecialiteEtdNiveau(sp, nv);
    }

}
