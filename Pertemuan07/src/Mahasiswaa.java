/* Nama File    : Mahasiswaa.java */
/* Deskripsi    : Kelas anak Mahasiswaa */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class Mahasiswaa extends Civitasakademika  {
    private String NIM;
    private Dosen DosenWali;

    public Mahasiswaa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = null;
    }

    public void setDosenWali(Dosen DosenWali) {
        this.DosenWali = DosenWali;
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (this.DosenWali != null) ? this.DosenWali.getNama() : "Belum memiliki dosen wali";
        System.out.println("Nama Mahasiswa: " + getNama() + " | " + "NIM: " + getNomor() + " | " + "Dosen Wali: " + namaWali);
    }
}
