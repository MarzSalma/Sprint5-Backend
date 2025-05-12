package com.salma.joueur1.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salma.joueur1.entities.Equipe;
import com.salma.joueur1.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByNomJoueur(String nom);

    List<Joueur> findByNomJoueurContains(String nom);

    @Query("select j from Joueur j where j.nomJoueur like %?1 and j.age > ?2")
    List<Joueur> findByNomAge(String nom, double age);

    @Query("select j from Joueur j where j.equipe=?1")
    List<Joueur> findByEquipe(String equipe);

    List<Joueur> findByEquipeIdEquipe(Long id);

    List<Joueur> findByOrderByNomJoueurAsc();

    @Query("select j from Joueur j order by j.nomJoueur ASC, j.age DESC")
    List<Joueur> trierJoueursNomsPrix();

    @Query("select j from Joueur j order by j.nomJoueur ASC, j.age ASC")
    List<Joueur> trierJoueursNomAge();

    List<Joueur> findByEquipe(Equipe equipe);

}