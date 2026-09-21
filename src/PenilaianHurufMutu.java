import java.util.Scanner;

public class PenilaianHurufMutu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Masukkan nilai angka(0-100):");

            if(scanner. hasNextDouble()){
                double nilai = scanner.nextDouble();
                 if (nilai < 0 || nilai > 100){
                    System.out.println("Nilai di luar rentang valid (0-100)");

                 } else{
                    char hurufMutu;
                    if(nilai >= 85){
                        hurufMutu = 'A';
                    } else if( nilai >=70){
                        hurufMutu = 'B';
                    } else if( nilai >=55){
                        hurufMutu = 'C';
                    } else if (nilai >= 40){
                        hurufMutu = 'D';
                    } else{
                        hurufMutu = 'E';
                    }
                     System.out.println("Nilai Huruf: " + hurufMutu);   
                 }
            } else{
                System.out.println("Input tidak valid! Harap masukkan angka");
                scanner.next();
            }
        } 
            
    }
}