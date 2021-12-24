package ma.education.tp5.collection;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        List<Integer> list3= new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(i-> System.out.println(i));
    }
}
