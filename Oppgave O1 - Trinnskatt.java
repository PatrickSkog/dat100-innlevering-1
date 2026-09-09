
import java.util.Scanner;
import static java.lang.Math.*; 

public class ScannerInput {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        double BI = in.nextDouble();

        double TS = 0;

        if (BI > 226100) {
            double grense = min(BI, 318300);
            double a = grense - 226100;
            TS += a * 1.7 / 100;
        }
        
        if (BI > 318300) {
            double grense = min(BI, 725050);
            double a = grense - 318300;
            TS += a * 4.0 / 100;
        }

        if (BI > 725050) {
            double grense = min(BI, 980100);
            double a = grense - 725050;
            TS += a * 13.7 / 100;
        }

        if (BI > 980100) {
            double grense = min(BI, 1467200);
            double a = grense - 980100;
            TS += a * 16.8 / 100;
        }

        if (BI > 1467200) {
            double a = BI - 1467200;
            TS += a * 17.8 / 100;
        }

        System.out.println("Trinnskatt er: " + TS);

        in.close();
    }
}