package ma.education.tp1.introduction;

public class SalleCours extends Salle {
    int nombre_de_places;
    public SalleCours(long id, String nom, int nombre_de_places) {
        super(id,nom);
        this.nombre_de_places=nombre_de_places;
    }
}
