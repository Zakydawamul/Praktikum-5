import java.util.Scanner;
public class Tugas3 {  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan saldo awal: ");
        double saldoAwal = input.nextDouble();
        
        System.out.println("masukkan jumlah uang yang ingin ditarik: ");
        double jumlahTarik = input.nextDouble();

        if (jumlahTarik > saldoAwal) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            double saldoAkhir = saldoAwal - jumlahTarik;
            System.out.println("Saldo akhir setelah penarikan: " + saldoAkhir);
        }
    }
    
}
