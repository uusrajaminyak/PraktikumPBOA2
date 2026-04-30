/* Nama File    : OperatorGenerik.java */
/* Deskripsi    : Kelas OperatorGenerik */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class OperatorGenerik {
    public  static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing, U extends Kucing> double Bobot2(T k1, U k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
