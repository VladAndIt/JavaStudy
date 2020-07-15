package Chapter_13_IO;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.System.out;

public class StaticImport {
    public static void main(String[] args) {
        double  side1=4,
                side2=3,
                hypot;
        hypot = sqrt(pow(side1,2)+pow(side2,2));
        System.out.println("hypot is " + hypot + " then side1 = " + side1 + "," + side2);
    }
}
