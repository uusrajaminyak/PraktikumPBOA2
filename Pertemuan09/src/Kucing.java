/* Nama File    : Kucing.java */
/* Deskripsi    : Kelas anak kucing */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

public class Kucing extends Anabul {
    
    public Kucing(String nama, double berat) {
        super(nama, berat); 
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: meong.");
    }
}