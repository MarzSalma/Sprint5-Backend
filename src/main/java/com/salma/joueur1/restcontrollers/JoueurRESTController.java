package com.salma.joueur1.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salma.joueur1.entities.Joueur;
import com.salma.joueur1.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JoueurRESTController {
    @Autowired
    JoueurService joueurService;

    // 1. Retourner tous les joueurs
    @RequestMapping(method = RequestMethod.GET)
    public List<Joueur> getAllJoueurs() {
        return joueurService.getAllJoueurs();
    }

    // 2. Consulter un joueur par son ID
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Joueur getJoueurById(@PathVariable("id") Long id) {
        return joueurService.getJoueur(id);
    }

    // 3. Créer un nouveau joueur
    @RequestMapping(method = RequestMethod.POST)
    public Joueur createJoueur(@RequestBody Joueur joueur) {
        return joueurService.saveJoueur(joueur);
    }

    // 4. Modifier un joueur
    @RequestMapping(method = RequestMethod.PUT)
    public Joueur updateJoueur(@RequestBody Joueur joueur) {
        return joueurService.updateJoueur(joueur);
    }

    // 5. Supprimer un joueur
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteJoueur(@PathVariable("id") Long id) {
        joueurService.deleteJoueurById(id);
    }

    // 6. Retourner les joueurs d'une équipe donnée
    @RequestMapping(value="/joueursequipe/{idEquipe}", method = RequestMethod.GET)
    public List<Joueur> getJoueursByEquipeId(@PathVariable("idEquipe") Long idEquipe) {
        return joueurService.findByEquipeIdEquipe(idEquipe);
    }

    // Endpoint racine pour éviter l'erreur 404
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Bienvenue sur l'API Joueurs (racine)";
    }


    @RequestMapping(value="/joueurByName/{nom}",method = RequestMethod.GET)
    public List<Joueur> findByNomJoueurContains(@PathVariable("nom") String nom) {
        return joueurService.findByNomJoueurContains(nom);
    }


}
