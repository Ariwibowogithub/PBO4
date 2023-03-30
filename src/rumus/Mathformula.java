package rumus;

public class Mathformula {
    double a;
    double b;
    double c;

    public Mathformula(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*
     * Math.sqrt yang digunakan untuk menghitung akar dari persamaan kuadrat
     * dan menggunakan if else statement untuk menentukan cara menghitung akar.
     */
    public void hitungABC() {
        double D = b * b - 4 * a * c;

        if (D > 0) {
            double X1 = (-b + Math.sqrt(D) / 2 * a);
            double X2 = (-b - Math.sqrt(D) / 2 * a);
            System.out.println("------------------------");
            System.out.println("Hasilnya adalah:");
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);
            System.out.println("------------------------");
        } else if (D == 0) {
            double X1 = (-b / 2 * a);
            System.out.println("------------------------");
            System.out.println("Hasilnya adalah:");
            System.out.println("X1 = X2 = " + X1);
            System.out.println("------------------------");
        } else {
            double riil = -b / 2 * a;
            double akarimajer = Math.sqrt(-D) / (2 * a);
            System.out.println("------------------------");
            System.out.println("Hasilnya adalah:");
            System.out.println("X1 = " + riil + " + " + akarimajer + "i");
            System.out.println("X2 = " + riil + " - " + akarimajer + "i");
            System.out.println("------------------------");
        }
    }
}
