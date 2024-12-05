import java.util.Scanner;

public class PemilihanHari07 {
    public static void main(String[] args) {
        Scanner input = new Input(System.in);
        String dayType;
        byte dayNumber;
        System.out.println("Masukkan angka 1 sampai 7");
        System.out.print("Masukkan : ");
        dayNumber = input.nextByte();
        input.close(); 
        dayType = "";
        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Hari Produktif";
        }  else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Hari Libur";
        } else {
            dayType = "Angka yang salah";
        }
        System.out.println(dayNumber + "adalah" + dayType);
    }
    
}
