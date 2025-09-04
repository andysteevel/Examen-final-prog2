package school.hei.examenfinalprog2;

import java.time.LocalDate;


public class Paiement {
    private int id;
    private String nomDePaiement;
    private float montant;
    private LocalDate datEtHeureDePaiement;

    public Paiement(int id, float montant, String nomDePaiement, LocalDate datEtHeureDePaiement) {
        this.id = id;
        this.montant = montant;
        this.nomDePaiement = nomDePaiement;
        this.datEtHeureDePaiement = datEtHeureDePaiement;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDePaiement() {
        return nomDePaiement;
    }

    public void setNomDePaiement(String nomDePaiement) {
        this.nomDePaiement = nomDePaiement;
    }

    public LocalDate getDatEtHeureDePaiement() {
        return datEtHeureDePaiement;
    }

    public void setDatEtHeureDePaiement(LocalDate datEtHeureDePaiement) {
        this.datEtHeureDePaiement = datEtHeureDePaiement;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
