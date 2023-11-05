import java.util.Scanner;

public class decompress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt(); //# of lines in the message

        for(int i = 0; i < L; i++){
            int x = scan.nextInt();
            String n = scan.next();

            System.out.println();

            for (int j = 0; j < x; j++) {
                System.out.print(n);
            }
        }
        scan.close();
    }
}
