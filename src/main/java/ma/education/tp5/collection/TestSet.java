package ma.education.tp5.collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class TestSet {
    private String name;

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(i-> System.out.println(i));
        Set<Client> set2 = new HashSet<Client>();
        set2.add(new Client(1,"ALAMI"));
        set2.add(new Client(1,"ALAMI"));
        set2.add(new Client(2,"SOUHAIL"));
        set2.forEach(i-> System.out.println(i));}
        @Override
        public boolean equals(Object o) {
        Client client = (Client) o;
        return this.hashCode()==client.code && this.name.equals(client.name);
        }
        @Override
        public int hashCode() {
        return hashCode();
        //Set<Integer> set3 = new TreeSet<>();
        //set3.add(22);
        //set3.add(11);
        //set3.add(15);
        //set3.add(9);
        //set3.forEach(i-> System.out.println(i));
        TreeSet <Client> set4 = new TreeSet<>();
        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(3,"SAID"));
        set4.add(new Client(2,"HASSAN"));
        set4.forEach(i-> System.out.println(i));
    }
}
