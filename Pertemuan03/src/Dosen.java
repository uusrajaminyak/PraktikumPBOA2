/* Nama File    : Dosen.java */
/* Deskripsi    : berisi atribut dan method untuk objek Dosen */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Konstruktor
    public Dosen(){}

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    //Mutator
    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}