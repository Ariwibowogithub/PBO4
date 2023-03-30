import java.util.Scanner;

public class Nilai {
    private float nilaiUAS, nilaiUTS, nilaiTugas, nilaiAkhir;
    private char nHuruf;
    private String predikat;

    // Konstruktor
    public Nilai(float uas, float uts, float tugas) {
        nilaiUAS = uas;
        nilaiUTS = uts;
        nilaiTugas = tugas;
        nilaiAkhir = (0.4f * nilaiUAS) + (0.4f * nilaiUTS) + (0.2f * nilaiTugas);
    }

    // Method untuk mendapatkan nilai huruf
    public char getNilHuruf(float nilai) {
        if(nilai >= 85) 
            nHuruf = 'A'; 
        else if(nilai >= 70 && nilai < 85) 
            nHuruf = 'B'; 
        else if(nilai >= 60 && nilai < 70) 
            nHuruf = 'C'; 
        else if(nilai >= 40 && nilai < 60) 
            nHuruf = 'D'; 
        else 
            nHuruf = 'E'; 
        return nHuruf; 
    }

    // Method untuk mendapatkan predikat
    public String getPredikat(char huruf) {
        switch(huruf) { 
            case 'A':
                predikat = "Apik"; 
                break; 
            case 'B':
                predikat = "Baik"; 
                break; 
            case 'C':
                predikat = "Cukup"; 
                break; 
            case 'D':
                predikat = "Dablek"; 
                break; 
            default:
                predikat = "Elek"; 
        } 
        return predikat; 
    }

    // Method untuk mencetak nilai
    public void cetakNilai() {
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat: " + getPredikat(nHuruf));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lagi = "Y";
        while (lagi.equals("Y") || lagi.equals("y")) {
            System.out.print("Masukkan nilai UAS: ");
            float uas = scanner.nextFloat();
            System.out.print("Masukkan nilai UTS: ");
            float uts = scanner.nextFloat();
            System.out.print("Masukkan nilai tugas: ");
            float tugas = scanner.nextFloat();

            Nilai nilai = new Nilai(uas, uts, tugas);
            nilai.cetakNilai();

            System.out.print("Input data lagi [Y/T] ? ");
            lagi = scanner.next();
        }
        scanner.close();
    }
}