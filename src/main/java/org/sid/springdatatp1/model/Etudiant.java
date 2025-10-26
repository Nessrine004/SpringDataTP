package org.sid.springdatatp1.model;

import org.sid.springdatatp1.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="etudiants")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false, name="nom_etudiant")
    private String nom;

    @Column(name="prenom_etudiant")
    private String prenom;

    @Enumerated(EnumType.STRING)
    private Genre genre;
}
