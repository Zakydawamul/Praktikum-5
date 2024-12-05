import java.util.Scanner;

public class CafeZaky07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char membership;
        int CoffeQuantity,TeaQuantity,BreadQuantity;
        double CoffePrice = 12000.0,TeaPrice = 7000.0,BreadPrice = 20000.0;
        double discount = 0.1;
        double count,TotalPayment;

        System.out.print("Status Membership (Y/N): ");
        membership = input.next().charAt(0);

        System.out.print("Masukkan jumlah pembelian kopi: ");
        CoffeQuantity = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        TeaQuantity = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        BreadQuantity = input.nextInt();

        count = (CoffeQuantity*CoffePrice) + (TeaQuantity*TeaPrice) + (BreadQuantity*BreadPrice);
        TotalPayment = 0;
        if (membership == 'Y' || membership == 'y') {
            TotalPayment = count - (discount*count);
        }else {
            TotalPayment = count;
        }
        
        input.close();

        int nominalInt = (int) TotalPayment;
        double discountPrice = count - (count-(count*discount));

        System.out.println("===========STRUK PEMBELIAN===========");

        System.out.println("Keanggotaan pelanggan: " + membership);
        System.out.println(
            String.format("item pembelian %s kopi &s Teh &s Roti", CoffeQuantity,TeaQuantity,BreadQuantity));
        System.out.println("nominal  bayar Rp: " + nominalInt);
        if (membership == 'Y'||membership == 'y') {
            System.out.println("Anda mendapatkan potongan harga Rp: " + (int) discountPrice);
        }
    }
    
}
