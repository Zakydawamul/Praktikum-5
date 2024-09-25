import java.util.Scanner;
public class PemilihanSwitch07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println("Masukkan angka1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka2: ");
        angka2 = sc.nextDouble();
        System.out.println("Masukkan operator (+ - * :)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;    
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Masukkan operator yang benar!");
        }
        sc.close();
        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {
        System.out.println(angka1 + operator + angka2 + " = " + hasil);
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
    }
}
