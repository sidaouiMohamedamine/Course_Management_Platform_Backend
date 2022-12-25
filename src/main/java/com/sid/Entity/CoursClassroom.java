package com.sid.Entity;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom;
    private Integer nbHeures;
    private boolean archive;
    @ManyToOne
    private Classe classe;

}
