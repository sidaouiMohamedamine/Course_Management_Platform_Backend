package com.sid.Controller;


import com.sid.Entity.CoursClassroom;
import com.sid.Entity.Niveau;
import com.sid.Entity.Specialite;
import com.sid.Service.CoursClassroomServiceImpl;
import com.sid.Service.ICoursClassroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coursClassroom")
public class CoursClassroomController {
        @Autowired
        private ICoursClassroom coursClassroomService;

        @PostMapping("/ajouterCoursClassroom/{codeClasse}")
        public CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom c,@PathVariable("codeClasse") Integer codeClasse){
            return coursClassroomService.ajouterCoursClassroom(c,codeClasse);
        }
        @DeleteMapping("/desaffecterCoursClassroomClasse/{idCours}")
        public void desaffecterCoursClassroomClasse(@PathVariable("idCours") Integer idCours){
                 coursClassroomService.desaffecterCoursClassroomClasse(idCours);
        }
    @PostMapping("/nb-heures-par-spec-niv/{spec}/{niv}")
    public Integer nbHeuresParSpecEtNiv(@PathVariable("spec") Specialite spec, @PathVariable("niv") Niveau niv) {
        return coursClassroomService.nbHeuresParSpecEtNiv(spec, niv);
    }

}
