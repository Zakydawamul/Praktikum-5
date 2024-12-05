import java.util.Scanner;
public class Pemilihan2latihan2_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        double diskon;
        int jumlah;

        System.out.println("---------------------------------------");
        System.out.println("========SISTEM PEMBELIAN BUKU==========");
        System.out.println("---------------------------------------");
        System.out.println("1. KAMUS");
        System.out.println("2. NOVEL");
        System.out.println("3. LAINNYA");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan jenis buku yang dibeli: ");
        jenisBuku = input.nextLine();
        System.out.println("Masukkan jumlah buku yang dibeli: ");
        jumlah = input.nextInt();

        diskon = 0;
        if (jenisBuku.equalsIgnoreCase("kamus")||jenisBuku.equalsIgnoreCase("novel")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 0.1;
                if (jumlah >2) {
                    diskon = diskon + 0.02;
                }
                
            }else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
                if (jumlah >3) {
                    diskon = diskon + 0.02;
                } else if (jumlah <= 3) {
                    diskon = diskon + 0.01;
                }
            }
            
        }else {
            diskon = 0;
            if (jumlah >3) {
                diskon = diskon + 0.05;
            }
        }
        System.out.println("Anda mendapatkan diskon sebesar: " + diskon + "%");
        input.close();
    }
    
}
