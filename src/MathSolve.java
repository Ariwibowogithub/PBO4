import rumus.Mathformula;
import java.util.Scanner;

public class MathSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char looping = 'y';

        /*
         * Program akan berjalan di dalam loop while.
         * dan akan memasukkan nilai a, b, dan c dari persamaan ax^2 + bx + c = 0
         */
        while (looping == 'y' || looping == 'Y') {
            System.out.print("Masukkan nilai a: ");
            double a = input.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = input.nextDouble();
            System.out.print("Masukkan nilai c: ");
            double c = input.nextDouble();

            // Memanggil method hitung() dari objek abc untuk menyelesaikan persamaan dan
            // menampilkan hasilnya.
            Mathformula abc = new Mathformula(a, b, c);
            abc.hitungABC();

            System.out.print("Input lagi Y/T? ");
            looping = input.next().charAt(0);
        }
        input.close();
    }
}
