package com.sid.Service;


import com.sid.Entity.Classe;
import com.sid.Entity.CoursClassroom;
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
        coursClassroomRepository.save(c);
        List<CoursClassroom> coursClassroom1=coursClassroomRepository.findAll();
        Classe classe=classeRepository.findById(codeClasse).orElse(null);

        return  null;


    }
}
