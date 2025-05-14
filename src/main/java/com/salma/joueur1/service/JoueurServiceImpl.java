package com.salma.joueur1.service;

import com.salma.joueur1.entities.Equipe;
import com.salma.joueur1.entities.Joueur;
import com.salma.joueur1.repos.EquipeRepository;
import com.salma.joueur1.repos.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurServiceImpl implements JoueurService {

    @Autowired
    private JoueurRepository joueurRepository;

    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public Joueur saveJoueur(Joueur j) {
        return joueurRepository.save(j);
    }

    @Override
    public Joueur updateJoueur(Joueur j) {
        return joueurRepository.save(j);
    }

    @Override
    public void deleteJoueur(Joueur j) {
        joueurRepository.delete(j);
    }

    @Override
    public void deleteJoueurById(Long id) {
        joueurRepository.deleteById(id);
    }

    @Override
    public Joueur getJoueur(Long id) {
        return joueurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Joueur> getAllJoueurs() {
        return joueurRepository.findAll();
    }

    @Override
    public List<Joueur> findByNomJoueur(String nom) {
        return joueurRepository.findByNomJoueur(nom);
    }

    @Override
    public List<Joueur> findByNomJoueurContains(String nom) {
        return joueurRepository.findByNomJoueurContains(nom);
    }

    @Override
    public List<Joueur> findByNomAge(String nom, Integer age) {
        return joueurRepository.findByNomAge(nom, age);
    }

    @Override
    public List<Joueur> findByEquipe(Equipe equipe) {
        return joueurRepository.findByEquipe(equipe);
    }

    @Override
    public List<Joueur> findByEquipeIdEquipe(Long id) {
        return joueurRepository.findByEquipeIdEquipe(id);
    }

    @Override
    public List<Joueur> findByOrderByNomJoueurAsc() {
        return joueurRepository.findByOrderByNomJoueurAsc();
    }

    @Override
    public List<Joueur> trierJoueursNomAge() {
        return joueurRepository.trierJoueursNomAge();
    }


}
