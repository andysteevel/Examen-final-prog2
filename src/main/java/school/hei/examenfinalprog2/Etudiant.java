package school.hei.examenfinalprog2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDateTime Date;



    public Etudiant(int id, String nom, String prenom, LocalDateTime Date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Date = Date;
    }



}
