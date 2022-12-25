package com.sid.Entity;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUtilisateur;
    private String prenom;
    private String password;
    @ManyToOne
    private Classe classe;
}
