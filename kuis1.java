import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class kuis1 {


    public static void main(String[] args) {
        Scanner int = new Scanner(System.in);

        System.out.println("Inputkan waktu sekarang:");
        System.out.print("Jam (0-23): ");
        int currentHour = scanner.nextInt();
        System.out.print("Menit (0-59): ");
        int currentMinute = scanner.nextInt();
        System.out.print("Detik (0-59): ");
        int currentSecond = scanner.nextInt();

       
        System.out.println("Inputkan waktu mulai perkuliahan:");
        System.out.print("Jam (0-23): ");
        int startHour = scanner.nextInt();
        System.out.print("Menit (0-59): ");
        int startMinute = scanner.nextInt();
        System.out.print("Detik (0-59): ");
        int startSecond = scanner.nextInt();

        LocalTime currentTime = LocalTime.of(currentHour, currentMinute, currentSecond);
        LocalTime startTime = LocalTime.of(startHour, startMinute, startSecond);

        Duration duration;
        if (startTime.isAfter(currentTime)) {
            duration = Duration.between(currentTime, startTime);
        } else {
            duration = Duration.between(currentTime, startTime.plusDays(1));
        }

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.printf("\nKekurangan waktu menuju perkuliahan adalah %d jam %d menit %d detik.%n",
                hours, minutes, seconds);

    }
}

        