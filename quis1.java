import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

public class quis1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========= Program Jam Kuliah ========");
        
        
        LocalTime now = LocalTime.now();
        System.out.println("Jam sekarang adalah: " + now);

        
        System.out.print("Masukkan jam kuliah: ");
        int jamKuliah = input.nextInt();
        System.out.print("Masukkan menit kuliah: ");
        int menitKuliah = input.nextInt();
        System.out.print("Masukkan detik kuliah: ");
        int detikKuliah = input.nextInt();

        
        LocalTime waktuKuliah = LocalTime.of(jamKuliah, menitKuliah, detikKuliah);
        System.out.println("Kuliah Anda dimulai: " + waktuKuliah + " : " + detikKuliah);

        if (now.isAfter(waktuKuliah)) {
            waktuKuliah = waktuKuliah.plusHours(24);
        }

        
        Duration sisaWaktu = Duration.between(now, waktuKuliah);

        
        long jamSisa = sisaWaktu.toHours();
        long menitSisa = sisaWaktu.toMinutes() % 60;
        long detikSisa = sisaWaktu.getSeconds() % 60;

       
        System.out.println("Jadi sisa waktu menuju perkuliahan Anda adalah: " + jamSisa + " jam " + menitSisa + " menit " + detikSisa + " detik");
        System.out.println("-----------------------------");

        input.close();
    }
}
