package ma. projet.grpc. entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence. GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private float solde;
    private String dateCreation;
    private String type;

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation =
                dateCreation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}