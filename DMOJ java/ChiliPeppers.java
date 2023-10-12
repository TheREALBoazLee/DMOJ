import java.util.Scanner;

public class ChiliPeppers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int SHU = 0;

        int n = scan.nextInt(); // number of peppers

        for (int i = 0; i < n+1; i++){
            String PepperName = scan.nextLine();

            if (PepperName.equals("Poblano")){
                SHU += 1500;
            }

             if (PepperName.equals("Mirasol")){
                SHU += 6000;
            }

             if (PepperName.equals("Serrano")){
                SHU += 15500;
            }

             if (PepperName.equals("Cayenne")){
                SHU += 40000;
            }

             if (PepperName.equals("Thai")){
                SHU += 75000;
            }

             if (PepperName.equals("Habanero")){
                SHU += 125000;
            }
        }

        System.out.println(SHU);

        




    }
}
