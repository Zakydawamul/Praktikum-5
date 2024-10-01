    import java.util.Scanner;
    public class Pemilihan2Percobaan207 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int pilihan_menu;
            String member, payment_metode;
            double diskon = 0, total_bayar, harga = 0;

            System.out.println("----------------------------");
            System.out.println("====== MENU KAFE JTI =======");
            System.out.println("----------------------------");
            System.out.println("1. Ricebowl");
            System.out.println("2. Ice Tea");
            System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
            System.out.println("----------------------------");
            System.out.println("Masukkan angka dari menu yang dipilih = ");
            pilihan_menu = input.nextInt();
            input.nextLine();
            System.out.println("Apakah punya member (y/n) ? = ");
            member = input.nextLine();
            System.out.println("Metode pembayaran (qris/cash)? = ");
            payment_metode = input.nextLine();
            System.out.println("----------------------------");
            input.close();
            
            diskon = 0;
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl = " + harga);
                    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea = " + harga);
                    
                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                    
                } else {
                    System.out.println("Masukkan Pilihan Menu dengan benar");
                    return;
                    
                } 
                    
                total_bayar = harga - (harga * diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            }
            else if (member.equalsIgnoreCase("n")) {
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl = " + harga);

                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea = " + harga);
                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                System.out.println("Total bayar = " + harga);
            }
            double final_payment = 0;
            if (payment_metode.equalsIgnoreCase("qris")) {
                final_payment = harga - 1000;
            } else {
                final_payment = harga;
            }
            System.out.println("Total bayar : " + final_payment);
            System.out.println("Metode bayar :" + payment_metode);
            System.out.println("-----------------------------------");
        }
        
    }
