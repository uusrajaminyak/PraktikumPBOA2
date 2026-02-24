/* Nama File    : Titik.java */
/* Deskripsi    : berisi atribut dan method untuk objek Titik */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 23 Februari 2026 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // Konstruktor
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik() {
        this(0, 0);
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }

    void getKuadran() {
        if (absis > 0 && ordinat > 0) {
            System.out.println("Titik berada pada kuadran I");
        } else if (absis < 0 && ordinat > 0) {
            System.out.println("Titik berada pada kuadran II");
        } else if (absis < 0 && ordinat < 0) {
            System.out.println("Titik berada pada kuadran III");
        } else if (absis > 0 && ordinat < 0) {
            System.out.println("Titik berada pada kuadran IV");
        } else if (absis == 0 && ordinat == 0) {
            System.out.println("Titik berada pada titik asal");
        } else if (absis == 0) {
            System.out.println("Titik berada pada sumbu Y");
        } else if (ordinat == 0) {
            System.out.println("Titik berada pada sumbu X");
        }
    }

    void getJarakPusat() {
        double jarak = Math.sqrt(absis * absis + ordinat * ordinat);
        System.out.println("Jarak titik ke pusat: " + jarak);
    }

    void getJarak(Titik T) {
        double jarak = Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
        System.out.println("Jarak titik ke titik lain: " + jarak);
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    void getRefleksiX() {
        System.out.println("Refleksi terhadap sumbu X: Titik(" + absis + ", " + (-ordinat) + ")");
    }

    void getRefleksiY() {
        System.out.println("Refleksi terhadap sumbu Y: Titik(" + (-absis) + ", " + ordinat + ")");
    }
}