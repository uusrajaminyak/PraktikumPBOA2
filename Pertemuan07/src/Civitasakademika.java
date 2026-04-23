/* Nama File    : Civitasakademika.java */
/* Deskripsi    : Kelas induk abstrak untuk Dosen dan Mahasiswaa */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public abstract class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public abstract String getNomor();
}
