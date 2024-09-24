public class quiz2 {
    public static void main(String[] args) {
        double kecepatanPakRomi = 70; // kecepatan dalam km/jam
        double waktu = 1 + 1.0 / 4; // waktu dalam jam
        double jarak = kecepatanPakRomi * waktu; // jarak dalam km
        double jarakMeter = jarak * 1000; // konversi jarak ke meter

        // Menampilkan hasil
        System.out.println("Kecepatan Pak Romi: " + kecepatanPakRomi + " km/jam");
        System.out.println("Waktu Pak Romi: " + waktu + " jam");
        System.out.println("Jarak Pak Romi ke Polinema: " + jarak + " km");
        System.out.println("Jarak Pak Romi dalam meter: " + jarakMeter + " meter");
    }
}
