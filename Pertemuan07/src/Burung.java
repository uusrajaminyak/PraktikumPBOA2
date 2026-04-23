/* Nama File    : Burung.java */
/* Deskripsi    : Kelas anak burung */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: cuit.");
    }
}