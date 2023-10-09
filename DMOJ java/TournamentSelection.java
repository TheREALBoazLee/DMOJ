import java.util.Scanner;

public class TournamentSelection {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int W = 0;
        
        for (int i = 0; i < 6; i++) {

        String result = scan.nextLine();

        if (result.equals("W")){
            W++;
        }
    }


        if (W >= 5) {
            System.out.println("1");
        }
        else if (W >= 3 && W < 5){
            System.out.println("2");
        }
        else if (W >= 1 && W < 3) {
            System.out.println("3");
        }
        else if (W == 0) {
            System.out.println("-1");
        }

        scan.close();
      
    }
}
