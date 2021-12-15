import java.util.*;

class DenKortasteVagen
{
 // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
 // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
 // av den andra mellanstationen på index 2 i vektorn.
    public static int[] mellanstationer (double[] a, double[][] b, double[] c)
     {
        double dMin = a[0] + b[0][0] + c[0];
        double distance;
        int[] minstations = new int[2];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[i].length; j++){
                distance = a[i] + b[i][j] + c[j];
                if (distance < dMin){
                    dMin = distance;
                    minstations[0] = i;
                    minstations[1] = j;
                }

            }
            
        }
    // koden här
         return minstations;
     }
 // langd returnerar längden av den kortaste vägen.

    public static double langd (double[] a, double[][] b, double[] c)
    {
    double dMin = a[0] + b[0][0] + c[0];
    double distance;

    for (int i = 0; i < a.length; i++){
        for (int j = 0; j < b[i].length; j++){
            distance = a[i] + b[i][j] + c[j];
            if (distance < dMin){
                dMin = distance;
            }
            System.out.print(a[i] + ",   " + b[i][j]+ ",  " + c[j]+ ",  " + (a[i] + b[i][j] + c[j]) + ":              ");
            System.out.println("U" + (i + 1) + " ---> " + "V" + (j + 1));
        }
    }
    return dMin;
    }
}

class BestamDenKortasteVagen{
    public static void main(String[] args) {
        System.out.println("Enter how many stations in zone 2: ");
        Scanner zon2 = new Scanner(System.in);
        int a = zon2.nextInt();

        System.out.println("Enter how many stations in zone 3: ");
        Scanner zon3 = new Scanner(System.in);
        int b = zon3.nextInt();

        double[] ai = new double[a];
        double[][] bij = new double[a][b];
        double[] cj = new double[b];
        
        for (int i = 0; i < a; i++ ){
            ai[i] = Math.round(Math.random()*100);

            for (int j = 0; j < b; j++){
                bij[i][j] = Math.round(Math.random()*100);

                cj[j] = Math.round(Math.random()*100);
            }
        }

        int [] kortaste = DenKortasteVagen.mellanstationer(ai, bij, cj);
        System.out.println(DenKortasteVagen.langd(ai, bij, cj) + " = kortaste : U"+ (kortaste[0] + 1)  + " ----> " + "V" + (kortaste[1] + 1));
    }
}