import java.util.*;
public class P4 {
    public static void main(String[] args) {
        double p,i;
        Scanner SC = new Scanner (System.in);
        System.out.print("ENTER WEIGHT IN POUNDS :- ");
        p=SC.nextDouble();
        System.out.print("ENTER HEIGHT IN INCHES :- ");
        i=SC.nextDouble();
        double kg = p * 0.45359237;
        double m = i * 0.0254;
        double bmi = kg / ( m * m);
        System.out.println("WEIGHT IN KILOGRAMS:- "+(p*0.45359237));
        System.out.println("HEIGHT IN METERS :- "+(i*0.0254));
        System.out.println("BMI OF A PERSON :- "+bmi);
    }
}
