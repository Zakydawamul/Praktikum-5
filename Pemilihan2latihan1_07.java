import java.util.Scanner;
public class Pemilihan2latihan1_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.println("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();

        if (bil1>bil2) {
            if (bil1>bil3) {
            System.out.println("bilangan " + bil1 + " Adalah bilangan terbesar");
        }   else {
            System.out.println("bilangan " + bil3 + " Adalah bilangan terbesar");
        } 
        }else if (bil2>bil3) {
            System.out.println("bilangan " + bil2 + " Adalah bilangan terbesar");            
        } else {
            System.out.println("bilangan " + bil3 + " Adalah bilangan terbesar");
        }
             
       input.close();
    }
    
}
