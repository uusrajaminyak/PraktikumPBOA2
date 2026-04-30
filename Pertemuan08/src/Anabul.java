/* Nama File    : Anabul.java */
/* Deskripsi    : Kelas induk anabul */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */


public class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void Gerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    public void Bersuara() {
        System.out.println(nama + " sedang bersuara.");
    }
}