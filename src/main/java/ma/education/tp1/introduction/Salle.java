package ma.education.tp1.introduction;

public class Salle {
    long id;
    String nom;
    Salle(){};
    Salle(String nom){
        this.nom =nom;
    }
    Salle(long id ,String nom){
        this.id = id;
        this.nom = nom;
    }
}
