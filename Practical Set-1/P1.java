import java.util.*;
public class P1 {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("ENTER DISTANCE IN METER :- ");
        double n = SC.nextDouble();
        double feet = n * 3.28084;
        System.out.printf("DISTANCE IN FEET :- %.2f%n", feet);
    }
}

