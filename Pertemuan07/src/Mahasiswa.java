/* Nama File    : Mahasiswa.java */
/* Deskripsi    : Realisasi Kelas Mahasiswa untuk Polimorfisme Overloading */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class Mahasiswa {
    private int NIM;
    private String Nama;
    private String Programstudi;

    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    public Mahasiswa(Mahasiswa M) {
        this.NIM = M.NIM;
        this.Nama = M.Nama;
        this.Programstudi = M.Programstudi;
    }

    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    public void setProgramStudi(Mahasiswa M) {
        this.Programstudi = M.Programstudi;
    }

    public void printData() {
        System.out.println("NIM: " + this.NIM + " | Nama: " + this.Nama + " | Prodi: " + this.Programstudi);
    }
}