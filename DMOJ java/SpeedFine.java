import java.util.Scanner;

public class SpeedFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedLimit = scan.nextInt();
        int carSpeed = scan.nextInt();

        int fine;

        int Olimit = carSpeed - speedLimit;

        if (speedLimit < carSpeed) {

            if (1 <= Olimit && Olimit <= 20){
                fine = 100;
                System.out.println("You are speeding and your fine is $" + fine + ".");
            }

            if (21 <= Olimit && Olimit <= 30){
                fine = 270;
                System.out.println("You are speeding and your fine is $" + fine + ".");
            }

            if (31 <= Olimit) {
                fine = 500;
                System.out.println("You are speeding and your fine is $" + fine + ".");
            }

            

        }

        else{System.out.println("Congratulations, you are within the speed limit!");}
        
        scan.close();
    }
}
