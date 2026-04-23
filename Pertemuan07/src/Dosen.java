/* Nama File    : Dosen.java */
/* Deskripsi    : Kelas anak Dosen */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}
