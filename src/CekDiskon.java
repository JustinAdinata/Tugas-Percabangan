import java.util.Scanner;

public class CekDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            System.out.print("\nMasukkan status member: ");
            String status = scanner.next();

            if (status.equals("GOLD")) {
                System.out.println("Diskon 20%");
            } else if (status.equals("SILVER")) {
                System.out.println("Diskon 15%");
            } else if (status.equals("BRONZE")) {
                System.out.println("Diskon 10%");
            } else {
                System.out.println("Tidak ada diskon (0%)");
            }
        
    }
}