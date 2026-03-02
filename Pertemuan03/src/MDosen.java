/* Nama File    : MDosen.java */
/* Deskripsi    : berisi atribut dan method untuk objek Dosen */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("123", "Budi", "Agama Katolik");
        System.out.println("NIP dosen: " + D1.getNIP());
        System.out.println("Nama Dosen: " + D1.getNama());
        System.out.println("Dosen Prodi: " + D1.getProdi());
    }
}
