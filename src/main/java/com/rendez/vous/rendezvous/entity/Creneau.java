package com.rendez.vous.rendezvous.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "creneau")
@JsonPropertyOrder({"resourceId"})
public class Creneau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "heure_debut")
    private String heureDebut;

    @Column(name = "heure_fin")
    private String heureFin;

    @Column(name = "disponible")
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;

    // Constructors, getters, and setters


    public Creneau() {
    }

    public Creneau(String heureDebut, String heureFin, boolean disponible, Centre centre) {
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.disponible = disponible;
        this.centre = centre;
    }

    public int getId() {
        return id;
    }
    public int getResourceId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Centre getCentre() {
        return centre;
    }
    public Centre getRessourceCentre(){
        return this.centre;
    }


    public void setCentre(Centre centre) {
        this.centre = centre;
    }
}
