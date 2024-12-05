import java.util.Scanner;
public class KategoriUsia07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan usia anda: ");

        try{
            int usia = Integer.parseInt(input.nextLine());

            if (usia < 0) {
                System.out.println("input harus bilangan positif");
            } else {
                String kategori = kategoriUsia(usia);
                System.out.println("Kategori usia anda: " + kategori);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Silahkan masukkan angka: ");
        } finally {
            input.close();
        }
    }

    public static String kategoriUsia(int usia) {
        if (usia >= 0 && usia <= 12) {
            return "Anak";
        } else if (usia >= 13 && usia <= 19) {
            return "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            return "Dewasa";
        } else { 
            return "Lansia";
        }
    }

    
}
