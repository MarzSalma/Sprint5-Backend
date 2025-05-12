package com.salma.joueur1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJoueur;
    private String nomJoueur;
    private Double age;
    private Date dateNaissance;
    @ManyToOne
    private Equipe equipe;
    public Joueur() {
        super();
    }

    public Joueur(Long idJoueur, String nomJoueur, Double age, Date dateNaissance) {
        this.idJoueur = idJoueur;
        this.nomJoueur = nomJoueur;
        this.age = age;
        this.dateNaissance = dateNaissance;
    }

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "idJoueur=" + idJoueur +
                ", nomJoueur='" + nomJoueur + '\'' +
                ", age=" + age +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
