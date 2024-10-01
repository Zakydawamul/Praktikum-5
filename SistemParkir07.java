import java.util.Scanner;

public class SistemParkir07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine().toLowerCase();

        int biaya;

        if (jenisKendaraan.equals("mobil")) {
            biaya = 5000; 
        } else if (jenisKendaraan.equals("motor")) {
            biaya = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid. Silahkan masukkan 'mobil' atau 'motor'.");
            input.close();
            return;
        } 

        System.out.println("jenis kendaraan: " + jenisKendaraan.substring(0, 1).toUpperCase() + jenisKendaraan.substring(1) );
        System.out.println("Total biaya parkir selama satu jam: Rp" + biaya);

        input.close();
    }
}
