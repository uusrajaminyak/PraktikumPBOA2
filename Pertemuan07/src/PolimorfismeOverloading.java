/* Nama File    : PolimorfismeOverloading.java */
/* Deskripsi    : Aplikasi Polimorfisme Ad Hoc Overloading */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class PolimorfismeOverloading {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.printData();

        Mahasiswa m2 = new Mahasiswa(2406012, "Darius the great", "Informatika");
        m2.printData();

        Mahasiswa m3 = new Mahasiswa(m2);
        m3.printData();
        
        // Varian 1
        m1.setProgramStudi();
        System.out.print("Varian 1: ");
        m1.printData();

        // Varian 2
        m1.setProgramStudi("Sistem Informasi");
        System.out.print("Varian 2: ");
        m1.printData();

        // Varian 3
        m1.setProgramStudi(m2);
        System.out.print("Varian 3: ");
        m1.printData();
    }
}