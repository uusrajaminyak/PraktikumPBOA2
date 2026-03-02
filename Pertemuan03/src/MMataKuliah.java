/* Nama File    : MMataKuliah.java */
/* Deskripsi    : berisi atribut dan method untuk objek MataKuliah */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah MK1 = new MataKuliah("MK001", "Pemrograman Berorientasi Objek", 3);
        System.out.println("ID Mata Kuliah: " + MK1.getIdMatkul());
        System.out.println("Nama Mata Kuliah: " + MK1.getNamaMatkul());
        System.out.println("Jumlah SKS: " + MK1.getSKS());
    }
}
