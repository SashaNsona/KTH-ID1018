public class Triangel {
    public static void main(String[] args) {
        double[] bis = tre_bisektriser(6, 6, 6, Math.PI/3, Math.PI/3, Math.PI/3);
        for(int i = 0; i <3; i++){
            System.out.println("bisektris" + (i + 1) + " : " + bis[i]);
        }


    }
    
    public static double omkrets (double a, double b, double c){
        double o = a + b + c;
        return o;
    }

    public static double hypotenusan (double katet_1, double katet_2){
        double hypotenusan = Math.sqrt(Math.pow(katet_1, 2) + Math.pow(katet_2, 2));
        return hypotenusan;
    }

    public static double area (double bas, double höjd){
        double a = (bas*höjd)/2;
        return a;
    }

    public static double bisektris (double b, double c, double alfa){
        double p = 2 * b * c * Math.cos (alfa / 2);
        double bis = p / (b + c);
        return bis;
    }
    public static double[] tre_bisektriser(double a, double b, double c, double vinkel_bc, double vinkel_ab, double vinkel_ac){
        double bis1 = Triangel.bisektris(b, c, vinkel_bc);
        double bis2 = Triangel.bisektris(a, b, vinkel_ab);
        double bis3 = Triangel.bisektris(a, c, vinkel_ac);
        double[] tre_bis = {bis1, bis2, bis3};
        return tre_bis;
    }

    public static double inskriven_cirkel_radie(double a, double b, double c){
        double s = (a + b + c)/2; //semiperimeter
        double r = Math.sqrt( ( (s-a) * (s-b) * (s-c) ) / s); 
        return r;
    }
    
    public static double omskriven_cirkel_radie(double a, double b, double c){
        double s = (a + b + c)/2; //semiperimeter
        double r = (a*b*c)/ (4 * (Math.sqrt(  s*((s-a) * (s-b) * (s-c))) ) ); 
        return r;
    }
}
