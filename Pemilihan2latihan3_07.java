import java.util.Scanner;
public class Pemilihan2latihan3_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ukuran,harga=0;
        String kategoriSepatu,merk;

        System.out.println("----------------------------");
        System.out.println("=====MASUKKAN MERK SEPATU=====");
        System.out.println("----------------------------");
        System.out.println("1.Converse\n2.Sketcher\n3.Nike");
        System.out.println("----------------------------");
        System.out.println("Masukkan merk sepatu yang anda beli: ");
        merk = input.nextLine();
        kategoriSepatu = "";
        switch (merk) {
            case "Converse":
                System.out.println("Masukkan kategori sepatu (Slip on/Hight Top): ");
                break;
            case "Sketcher":
                System.out.println("Masukkan kategori sepatu (Woman/Man): ");
                break;
            case "Nike":
                System.out.println("Masukkan kategori sepatu (Kids/Adults): ");
                break;
            default:
                System.out.println("Merk tidak valid");
                return;
        }
        kategoriSepatu = input.nextLine();
        System.out.println("Masukkan ukuran sepatu yang anda beli: ");
        ukuran = input.nextInt();

        harga = 0;
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategoriSepatu.equalsIgnoreCase("Slip on")&& ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategoriSepatu.equalsIgnoreCase("Hight Top")&& ukuran >=41 && ukuran <= 44) {
                harga = 1200000;
            }
        }else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategoriSepatu.equalsIgnoreCase("Woman")&& ukuran >= 36 && ukuran <= 40) {
                harga = 1000000;
            } else if (kategoriSepatu.equalsIgnoreCase("Man")&& ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            }
        }else if (merk.equalsIgnoreCase("Nike")) {
            if (kategoriSepatu.equalsIgnoreCase("Kids")&& ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategoriSepatu.equalsIgnoreCase("Adults")&& ukuran >= 41 && ukuran <=44) {
                harga = 1500000;
            }
        }else {
            System.out.println("Masukkan merk sepatu yang tersedia");
        }
        System.out.println("Harga sepatu " + merk + " kategori " + kategoriSepatu + " ukuran " + ukuran + " Adalah : Rp " + harga);
    }
    
}
