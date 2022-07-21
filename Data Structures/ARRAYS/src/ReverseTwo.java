import java.util.*;

public class ReverseTwo {
    public static void main(String[] args) {
//
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        Collections.rotate(l,2);
        System.out.println(l);


    }
}
