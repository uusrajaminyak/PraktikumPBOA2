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

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 5);

        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());
        // System.out.println("Jumlah objek Titik yang telah dibuat: " + T4.getCounterTitik());

        T3.getKuadran();
        T4.getKuadran();

        T3.getJarakPusat();
        T4.getJarakPusat();

        T3.getJarak(T4);
        T4.getJarak(T3);

        T3.refleksiX();
        T3.printTitik();
        T3.getRefleksiX();

        T4.refleksiY();
        T4.printTitik();
        T4.getRefleksiY();
    }
}