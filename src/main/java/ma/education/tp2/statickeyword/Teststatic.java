package ma.education.tp2.statickeyword;

public class Teststatic {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1,"AHMAD",20);
        Etudiant e2 = new Etudiant(2,"SAID",30);
        System.out.println(e1.id+" "+e1.nom+" "+e1.nbEtudiants);
        System.out.println(e2.id+" "+e2.nom+" "+e2.nbEtudiants);
    }
//l'attribut static n'est pas instancié hors de la classe
}
