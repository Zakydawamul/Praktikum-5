import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        
        System.out.println("masukkan nilai UTS");
        double uts = input.nextDouble();

        System.out.println("masukkan nilai UAS");
        double uas = input.nextDouble();

        double rataRata = (tugas + uts + uas) / 3;
        System.out.println("Rata-rata dari tugas, UTS, dan UAS adalah: " + rataRata);
    }
}
