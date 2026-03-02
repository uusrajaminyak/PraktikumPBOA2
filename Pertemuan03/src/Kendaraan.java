/* Nama File    : Kendaraan.java */
/* Deskripsi    : berisi atribut dan method untuk objek Kendaraan */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){}

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
