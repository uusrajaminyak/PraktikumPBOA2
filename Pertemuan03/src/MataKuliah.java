/* Nama File    : MataKuliah.java */
/* Deskripsi    : berisi atribut dan method untuk objek MataKuliah */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class MataKuliah {
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    public MataKuliah(){}

    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSKS() {
        return sks;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
