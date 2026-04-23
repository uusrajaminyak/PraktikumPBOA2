/* Nama File    : Seminar.java */
/* Deskripsi    : Kelas aplikator Seminar */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class Seminar {
    private Civitasakademika[] pesertaa;
    private int jumlahPeserta;

    public Seminar() {
        pesertaa = new Civitasakademika[100];
        jumlahPeserta = 0;
    }

    public int countPeserta() {
        return this.jumlahPeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (jumlahPeserta < 100) {
            pesertaa[jumlahPeserta] = peserta;
            jumlahPeserta++;
        } else {
            System.out.println("Seminar sudah penuh!");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println((i + 1) + ". " + pesertaa[i].getNama() + " | " + pesertaa[i].getNomor());
        }
    }

    public int countMahasiswa() {
        int hitungMahasiswa = 0;
        for (int i = 0; i < jumlahPeserta; i++) {
            if (pesertaa[i] instanceof Mahasiswaa) {
                hitungMahasiswa++;
            }
        }
        return hitungMahasiswa;
    }
}
