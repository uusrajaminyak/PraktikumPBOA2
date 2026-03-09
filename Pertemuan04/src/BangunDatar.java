/* Nama File    : BangunDatar.java */
/* Deskripsi    : berisi atribut dan method untuk objek BangunDatar */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 9 Maret 2026 */

public class BangunDatar {
    //Atribut
    private  Integer jmlSisi;
    private String Warna;
    private String border;
    private static Integer counterBangunDatar = 0;

    //Konstruktor
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(Integer jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        Warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //Selektor
    public Integer getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return Warna;
    }

    public String getBorder() {
        return border;
    }

    //Mutator
    public void setJmlSisi(Integer jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    //Method
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + Warna);
        System.out.println("Border: " + border);
    }
}