package com.rendez.vous.rendezvous.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rendez.vous.rendezvous.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rdv")
@JsonPropertyOrder({"resourceId"})
public class RDV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "creneau_id")
    private Creneau creneau;

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;

    @ManyToOne(cascade = {CascadeType.PERSIST,
                            CascadeType.MERGE,
                            CascadeType.DETACH,
                            CascadeType.REFRESH}
    )
    @JoinColumn(name = "user_id")
    private User user;

    public RDV() {
    }

    public RDV(String date, Creneau creneau, Centre centre, User user) {
        this.date = date;
        this.creneau = creneau;
        this.centre = centre;
        this.user = user;
    }
// Constructors, getters, and setters

    public int getId() {
        return id;
    }
    public int getResourceId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Creneau getCreneau() {
        return creneau;
    }
    public Creneau getResourceCreneau() {
        return creneau;
    }


    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Centre getCentre() {
        return centre;
    }


    public Centre getResourceCentre() {
        return centre;
    }




    public void setCentre(Centre centre) {
        this.centre = centre;
    }




    public void setUser(User user) {
        this.user = user;
    }
}
