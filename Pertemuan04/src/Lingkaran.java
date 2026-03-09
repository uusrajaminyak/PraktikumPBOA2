/* Nama File    : Lingkaran.java */
/* Deskripsi    : berisi atribut dan method untuk objek Lingkaran */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 9 Maret 2026 */

public class Lingkaran extends BangunDatar {
    //Atribut
    private Double jari;

    //Konstruktor
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(Double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    //Selektor
    public Double getJari() {
        return jari;
    }

    //Mutator
    public void setJari(Double jari) {
        this.jari = jari;
    }

    //Method
    public Double getLuas() {
        return Math.PI * jari * jari;
    }

    public Double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}