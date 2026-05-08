/* Nama File    : Anabul.java */
/* Deskripsi    : Kelas induk anabul */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

public class Anabul {
    protected String panggilan;
    protected double berat; 

    public Anabul() {}

    public Anabul(String nama) {
        this.panggilan = nama;
    }

    public Anabul(String nama, double berat) {
        this.panggilan = nama;
        this.berat = berat;
    }

    public String getNama() {
        return this.panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBerat() {
        return this.berat;
    }

    public void Gerak() {
        System.out.println(panggilan + " sedang bergerak.");
    }

    public void Bersuara() {
        System.out.println(panggilan + " sedang bersuara.");
    }
}