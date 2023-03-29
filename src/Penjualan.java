import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    private float totalPembelian;

    // method untuk mengisi data penjualan
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalPembelian = harga * jumlah;
    }

    // method untuk mengembalikan total pembelian
    public float getTotalPembelian() {
        return totalPembelian;
    }

    // method untuk mengembalikan bonus
    public String getBonus() {
        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    // method untuk mencetak nota
    public void cetakNota() {
        System.out.println("Kode barang: " + kode);
        System.out.println("Nama barang: " + nama);
        System.out.println("Harga satuan: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total pembelian: " + totalPembelian);
        System.out.println("Bonus: " + getBonus());
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Penjualan penjualan = new Penjualan();
            String inputLagi = "Y";

            while (inputLagi.equalsIgnoreCase("Y")) {
                System.out.print("Masukkan kode barang: ");
                String kode = input.next();
                System.out.print("Masukkan nama barang: ");
                String nama = input.next();
                System.out.print("Masukkan harga satuan: ");
                float harga = input.nextFloat();
                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();
                System.out.printf("==============================\n");
                System.out.printf("NOTA PEMBELIAN\n");
                System.out.printf("==============================\n");

                penjualan.setData(kode, nama, harga, jumlah);
                penjualan.cetakNota();

                System.out.print("Input data lagi [Y/T]? ");
                inputLagi = input.next();
            }
        }
    }
}