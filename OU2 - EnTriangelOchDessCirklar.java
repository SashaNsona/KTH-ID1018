
import java.util.Scanner;

public class EnTriangelOchDessCirklar {
    public static void main(String[] args) {
        //take user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the triangle's three sides:");

        //declare variables for all three sides of the triangle
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        //declare variables for the radii 
        double incircleRadius = Triangel.inskriven_cirkel_radie(a, b, c);
        double circRadius = Triangel.omskriven_cirkel_radie(a, b, c);

        System.out.println();

        //write out the incircle and circumcircle radii
        System.out.println("The radius of the incircle is " + incircleRadius);
        System.out.println("The radius of the circumcircle is " + circRadius);
    }
}