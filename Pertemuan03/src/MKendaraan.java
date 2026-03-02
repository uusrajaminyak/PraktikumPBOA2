/* Nama File    : MKendaraan.java */
/* Deskripsi    : berisi atribut dan method untuk objek Kendaraan */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan("B 1234 ABC", "Mobil");
        System.out.println("No Plat Kendaraan: " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan: " + K1.getJenis());
    }
}
