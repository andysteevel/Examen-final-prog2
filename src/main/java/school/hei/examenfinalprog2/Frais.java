package school.hei.examenfinalprog2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Frais {

    private int id;
    private String label;
    private double montant;
    private LocalDateTime deadline;
    private List<Paiement> paiements = new ArrayList<>();
    private Frais IN_PROGRESS ;
    private Frais LATE;
    private Frais PAID;
    private Frais OVERPAID;


    public Frais(int id, String label, double montant, LocalDateTime deadline) {
        this.id = id;
        this.label = label;
        this.montant = montant;
        this.deadline = deadline;
    }


    public void addPayment(Paiement paiement) {
        paiements.add(paiement);
    }

    public double getTotalPaiements() {
        return paiements.stream()
                        .mapToDouble(Paiement::getMontant).sum();
    }

    public Frais getStatus(LocalDateTime now) {
        double total = getTotalPaiements();
        if (total == montant) {
            return PAID;
        } else if (total > montant) {
            return OVERPAID;
        } else {
            if (now.isAfter(deadline)) {
                return LATE;
            } else {
                return IN_PROGRESS ;
            }
        }
    }



}
