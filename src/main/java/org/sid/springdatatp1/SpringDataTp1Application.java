package org.sid.springdatatp1;

import org.sid.springdatatp1.enums.Genre;
import org.sid.springdatatp1.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sid.springdatatp1.repository.EtudiantRepository;

@SpringBootApplication
public class SpringDataTp1Application implements CommandLineRunner {

   @Autowired
    EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataTp1Application.class, args);
    }

    @Override
    public void run(String... args) {
        etudiantRepository.save(Etudiant.builder().nom("Adnani").prenom("Morad").genre(Genre.Homme).build());
        etudiantRepository.save(Etudiant.builder().nom("Sara").prenom("Ali").genre(Genre.Femme).build());
    }
}