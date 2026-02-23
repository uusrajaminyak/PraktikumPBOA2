/* Nama File    : MTitik.java */
/* Deskripsi    : berisi atribut dan method untuk objek Titik */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Kamis, 23 Januari 2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
    }
}