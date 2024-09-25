import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, nim;
        char classes;
        byte absentNumber;
        double quizGrade, taskGrade, examGrade, lastGrade;

        System.out.println("================INPUT BIODATA MAHASISWA================");

        System.out.print("Masukkan nama anda: ");
        name = input.nextLine();
        System.out.print("Masukkan NIM anda: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas anda: ");
        classes = input.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen anda: ");
        absentNumber = input.nextByte();

        System.out.println("================INPUT NILAI MAHASISWA================");
        System.out.print("Masukkan nilai kuis: ");
        quizGrade = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        taskGrade = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        examGrade = input.nextDouble();
        input.close();

        System.out.println("==============Hasil===============");

        lastGrade = (quizGrade + taskGrade + examGrade) / 3;
        char grade;
        String qualification;

        if (lastGrade > 80 && lastGrade <= 100) {
            grade = 'A';
            qualification = "Sangat Baik";
        } else if (lastGrade > 73 && lastGrade <= 80) {
            grade = 'B';
            qualification = "Lebih Dari Baik";
        } else if (lastGrade > 65 && lastGrade <= 73) {
            grade = 'B';
            qualification = "Baik";
        } else if (lastGrade > 60 && lastGrade <= 65) {
            grade = 'C';
            qualification = "Lebih Dari Cukup";
        } else if (lastGrade > 50 && lastGrade <= 60) {
            grade = 'C';
            qualification = "Cukup";
        } else if (lastGrade > 39 && lastGrade <= 50) {
            grade = 'D';
            qualification = "Kurang";
        } else {
            grade = 'E';
            qualification = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama: " + name + ", NIM: " + nim);
        System.out.println("Kelas: " + "1" + classes + ", Absen: " + absentNumber);
        System.out.println("Nilai Akhir: " + lastGrade);
        System.out.println("Nilai Akhir Huruf: " + grade);
        System.out.println("Kualifikasi Akhir: " + qualification);
    }
}
