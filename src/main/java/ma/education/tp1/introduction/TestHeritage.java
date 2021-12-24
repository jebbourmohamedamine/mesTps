package ma.education.tp1.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1=new SalleCours(1,"Salle1",20);
        SalleCours s2=new SalleCours(2,"Salle2",20);
        SalleCours s3=(SalleCours) s1;//le compilateur retourne à la classe mère où on n'a que deux variables
        SalleCours s4=s2;
        Laboratoires s5=new Laboratoires(2, "LABO", "CHIMIE");
        SalleCours s6= new SalleCours(2, "Salle 2", 20);
        Laboratoires s7=s5;//le compilateur retourne à la classe mère où on n'a que deux variables
        //non car il propose de changer s5 en ClasseCours
        SalleCours s8=s6;
        System.out.println(s1.id+ " " +s1.nom );
        System.out.println(s2.id+ " " +s2.nom +s2.nombre_de_places);
        System.out.println(s3.id+ " " +s3.nom +s3.nombre_de_places);
        System.out.println(s4.id+ " " +s4.nom +s4.nombre_de_places);
        System.out.println(s5.id+ " " +s5.nom +s5.type);
        System.out.println(s6.id+ " " +s6.nom +s6.nombre_de_places);
        System.out.println(s7.id+ " " +s7.nom +s7.type);
    }
}
