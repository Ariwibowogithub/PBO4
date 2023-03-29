import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int detik, sisaDetik, menit, jam, hari;

        do {
            System.out.print("Masukkan jumlah detik: ");
            detik = input.nextInt();

            // Konversi detik ke hari
            hari = detik / 86400;
            sisaDetik = detik % 86400;

            // Konversi sisa detik ke jam
            jam = sisaDetik / 3600;
            sisaDetik = sisaDetik % 3600;

            // Konversi sisa detik ke menit
            menit = sisaDetik / 60;
            sisaDetik = sisaDetik % 60;

            System.out.printf("Detik = %d\n", detik);
            System.out.printf("Hari = %d\n", hari);
            System.out.printf("Jam = %d\n", jam);
            System.out.printf("Menit =  %d\n", menit);
            System.out.printf("Sisa Detik = %d\n", sisaDetik);

            System.out.print("Input data lagi [Y/T]? ");
        } while (input.next().equalsIgnoreCase("Y"));

        input.close();
    }
}