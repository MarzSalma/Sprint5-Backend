package com.salma.joueur1.restcontrollers;

import com.salma.joueur1.entities.Equipe;
import com.salma.joueur1.repos.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eq")
@CrossOrigin("*")
public class EquipeRESTController {
    @Autowired
    EquipeRepository equipeRepository;
    @RequestMapping(method = RequestMethod.GET)
    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Equipe getEquipeById(@PathVariable ("id") Long id) {
        return equipeRepository.findById(id).get();
    }
}
