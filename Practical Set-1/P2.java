import java.util.*;
public class P2 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner SC = new Scanner (System.in);
        System.out.print("ENTER CO-EFFICIENT A :- ");
        a = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT B :- ");
        b = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT C :- ");
        c = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT D :- ");
        d = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT E :- ");
        e = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT F :- ");
        f = SC.nextDouble();
        
        double D, Dx, Dy;
        D = (a*d) - (b*c) ;
        Dx = (e*d) - (b*f) ;
        Dy = (a*f) - (c*e) ;
        
        if(D == 0) {
            System.out.println("THIS SOLUTION HAS NO UNIQUE SOLUTION (D=0)");
        } 
        else {
            x = Dx / D ;
            y = Dy / D ;
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}
