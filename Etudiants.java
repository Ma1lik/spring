package com.example.dbconnection.Entities;

 import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "etudaint")
public class Etudiants{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private Date dateNaissance;
    private int score;

    public Etudiants() {
    }

    public Etudiants(Long id, String nom, String email, Date dateNaissance, int score) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Etudiants{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", score=" + score +
                '}';
    }
}
