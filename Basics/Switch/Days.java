import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char op=sc.next().trim().charAt(0);
        switch(op){
            case 'm','t','w','h','f' -> System.out.println("WeekDay");
            case 's','x'-> System.out.println("WeekEnd");
            default -> System.out.println("Invalid Operator");
        }

    }
}
