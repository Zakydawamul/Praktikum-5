import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.println("masukkan bilangan kedua: ");
        int b = input.nextInt();

        int c = a + b;

        System.out.println("Hasil penjumlahan dari bilangan pertama dan kedua adalah: " + c);
        
    }
    
}
    