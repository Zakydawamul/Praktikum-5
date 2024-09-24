import java.util.Scanner;
public class PemilihanBilangan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? " adalah angka genap" : " adalah angka ganjil";
        System.out.println("angka " + angka + hasil);

    }
    
}
