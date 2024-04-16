package com.rendez.vous.rendezvous.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.util.List;


@Entity
@JsonPropertyOrder({"resourceId"})
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private AdminCentre adminCentre;


    public Centre() {
    }

    public Centre(String nom, String adresse, AdminCentre adminCentre) {
        this.nom = nom;
        this.adresse = adresse;
        this.adminCentre = adminCentre;
    }

    // Getters and setters


    public int getId() {
        return id;
    }
    public int getResourceId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public AdminCentre getAdminCentre() {
        return adminCentre;
    }

    public void setAdminCentre(AdminCentre adminCentre) {
        this.adminCentre = adminCentre;
    }
}
