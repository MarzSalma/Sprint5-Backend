package com.salma.joueur1.service;

import com.salma.joueur1.entities.Equipe;
import com.salma.joueur1.entities.Joueur;

import java.util.List;

public interface JoueurService {
    Joueur saveJoueur(Joueur j);
    Joueur updateJoueur(Joueur j);
    void deleteJoueur(Joueur j);
    void deleteJoueurById(Long id);
    Joueur getJoueur(Long id);
    List<Joueur> getAllJoueurs();
    List<Joueur> findByNomJoueur(String nom);
    List<Joueur> findByNomJoueurContains(String nom);
    List<Joueur> findByNomAge(String nom, Integer age);
    List<Joueur> findByEquipe(Equipe equipe);
    List<Joueur> findByEquipeIdEquipe(Long id);
    List<Joueur> findByOrderByNomJoueurAsc();
    List<Joueur> trierJoueursNomAge();

}
