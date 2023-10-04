import java.util.Scanner;

public class Delivedroid {       
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt(); //number of package delivered
        int c = scan.nextInt(); //number of collisions with obstacles

        scan.close();

        int f1 = ((p * 50) ); //50 points for package delivered
        int f2 = ((c * 10)); //losing 10 points for collision

        int f3 = ((f1 - f2) + 500); //final for bonus mark

        if (p > c) {
            System.out.println(f3);
        }

        else{System.out.println(f1-f2);}

    }
}
