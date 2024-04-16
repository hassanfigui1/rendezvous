/*package com.rendez.vous.rendezvous.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@JsonPropertyOrder({"resourceId"})
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    //@JsonIgnore  to ignore it from being displayed in the endpoint rest API
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Getter
    @Column(name = "email")
    private String email;

    @Column(name = "mot_de_passe")
    private String motDePasse;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST,
                                            CascadeType.MERGE,
                                            CascadeType.DETACH,
                                            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private List<RDV> rdvs;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles=new ArrayList<>();

    public User(List<Role> roles, String nom, String prenom, String email, String motDePasse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
    }


    public User(String email, String motDePasse, Collection<GrantedAuthority> grantedAuthorities) {
    }

    public int getResourceId(){
        return this.id;
    }
    public List<RDV> getResourceRdvs() {
        return rdvs;
    }

    public void setRdvs(List<RDV> rdvs) {
        this.rdvs = rdvs;
    }

    // add convenience methods for bi-directional relationship
    public void addRdv(RDV rdv) {
        if(rdv ==null){
            this.rdvs = new ArrayList<RDV>();
        }else{
            this.rdvs.add(rdv);
            rdv.setUser(this);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", rdvs=" + rdvs +
                '}';
    }
}
*/