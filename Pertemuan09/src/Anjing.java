/* Nama File    : Anjing.java */
/* Deskripsi    : Kelas anak anjing */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: guk-guk.");
    }
}
