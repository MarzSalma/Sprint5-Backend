package com.salma.joueur1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salma.joueur1.entities.Equipe;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource (path = "eq")
@CrossOrigin("http://localhost:4200/")
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
} 