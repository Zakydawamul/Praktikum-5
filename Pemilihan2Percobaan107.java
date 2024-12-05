import java.util.Scanner;

public class Pemilihan2Percobaan107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        // Tahun kabisat
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                
                if (tahun % 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        input.close();
    }
}
