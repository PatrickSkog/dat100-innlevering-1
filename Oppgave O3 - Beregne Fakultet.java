import java.util.Scanner;

public class Heltall Fakultet {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn heltall");
        int n = in.nextInt();
        int N = n*(n-1);
        n=n-1;
        
         while (n > 1){
             N = N*(n-1);
             n = n-1;
        }
        System.out.println(N);
        
        in.close();
    }
}