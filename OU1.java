import java.util.*; // Scanner, Locale

class Temperaturer {
    public static void main (String[] args)
 {
        System.out.println ("TEMPERATURER\n");

        // inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale (Locale.US);

        // mata in uppgifter om antalet veckor och antalet mätningar
        System.out.print ("antalet veckor: ");
        int antalVeckor = in.nextInt ();
        System.out.print ("antalet mätningar per vecka: ");
        int antalMatningarPerVecka = in.nextInt ();

        // plats att lagra temperaturer
        double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];

        // mata in temperaturerna
        for (int vecka = 1; vecka <= antalVeckor; vecka++) {
            System.out.println ("temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                t[vecka][matning] = in.nextDouble ();
        }
        System.out.println ();

        // visa temperaturerna
        System.out.println ("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++){

            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                System.out.print (t[vecka][matning] + " ");

            System.out.println ();
        }

        System.out.println ();

        // den minsta, den största och medeltemperaturen – veckovis
        double[] minT = new double[antalVeckor + 1];
        double[] maxT = new double[antalVeckor + 1];
        double[] sumT = new double[antalVeckor + 1];
        double[] medelT = new double[antalVeckor + 1];
        // koden ska skrivas här
        double temp = t[1][1];
        double temp2 = t[1][1];
        double sum = 0;
        double medel;

        for(int i = 1; i<=antalVeckor; i++ ){
            temp = t[i][1];
            temp2 = t[i][1];
            sum = 0;

            for(int j = 1; j<=antalMatningarPerVecka; j++){
                
               if(t[i][j] <= temp){
                  temp = t[i][j];
                  minT[i] = temp;
               }
               if(t[i][j] >= temp2){
                  temp2 = t[i][j];
                  maxT[i] = temp2;


                }
                sum = sum + t[i][j];

                
            }
            sumT[i] = sum;
            medel = sum/antalMatningarPerVecka;
            medelT[i] = medel;
           System.out.println("Min week " + i + " = " + minT[i]);
           System.out.println("Max week " + i + " = " + maxT[i]);
           System.out.println("Sum week " + i + " = " + sumT[i]);
           System.out.println("Medel week " + i + " = " + medelT[i]);
           System.out.println(" ");


         }

         
        // visa den minsta, den största och medeltemperaturen för varje vecka

        // koden ska skrivas här
        // den minsta, den största och medeltemperaturen - hela mätperioden
        double minTemp = minT[1];
        double maxTemp = maxT[1];
        double sumTemp = 0;
        double medelTemp = 0;
        // koden ska skrivas här
        // visa den minsta, den största och medeltemperaturen i hela mätperioden

        for(int i = 1; i<=minT.length -1; i++ ){
                if(minT[i] <= minT[1]){
                    minTemp = minT[i];
                }

                if(maxT[i] >= maxT[1]){
                    maxTemp = maxT[i];
                }
            
            sumTemp += sumT[i];
        }
         medelTemp = sumTemp/(antalVeckor*antalMatningarPerVecka);
         System.out.println("Min alla = " + minTemp);
         System.out.println("Max alla = " + maxTemp);
         System.out.println("Sum alla = " + sumTemp );
         System.out.println("Medel alla = " + medelTemp );
        // koden ska skrivas här
    }
}
