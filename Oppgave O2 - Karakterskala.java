import java.util.Scanner;

public class Karakterskala {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int poeng;

            // Gjenta innlesing helt til poengsummen er gyldig
            do {
                System.out.print("Skriv inn poengsum for student :");
                poeng = in.nextInt();

                if (poeng < 0 || poeng > 100) {
                    System.out.println("Ugyldig poengsum! Prøv igjen.");
                }

            } while (poeng < 0 || poeng > 100);

            // Nå er poeng garantert gyldig - finn karakter
            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }

        in.close();
    }
}