/* Nama File    : Persegi.java */
/* Deskripsi    : berisi atribut dan method untuk objek Persegi */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 9 Maret 2026 */

public class Persegi extends BangunDatar {
    //Atribut
    private Double sisi;

    //Konstruktor
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(Double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    //Selektor
    public Double getSisi() {
        return sisi;
    }

    //Mutator
    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    //Method
    public Double getLuas() {
        return sisi * sisi;
    }

    public Double getKeliling() {
        return 4 * sisi;
    }

    public Double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
