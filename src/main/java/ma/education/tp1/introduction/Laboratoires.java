package ma.education.tp1.introduction;

public class Laboratoires extends Salle {
    String type;
    public Laboratoires(long id, String nom, String type) {
        super(id,nom);
        this.type=type;
    }
}
