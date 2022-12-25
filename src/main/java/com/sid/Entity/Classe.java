package com.sid.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeClasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToMany(mappedBy = "classe")
    private Set<CoursClassroom> coursClassrooms;
}
