import java.util.Scanner;
public class Segitiga07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas : ");
        alas = sc.nextInt();
        System.out.print("Masukkan tunggi:");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
        sc.close();
    }
}

    
