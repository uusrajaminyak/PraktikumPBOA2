/* Nama File    : MainTeman.java */
/* Deskripsi    : Aplikasi untuk menguji kelas Teman */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

public class MainTeman {
    public static void main(String[] args) {
        Teman daftarTeman = new Teman();

        daftarTeman.addNama("Tamima");
        daftarTeman.addNama("Marcella");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Tamima"); 
        daftarTeman.showTeman();

        System.out.println("Banyaknya teman: " + daftarTeman.getNbelm());

        System.out.println("Teman pada indeks ke-1: " + daftarTeman.getNama(1));

        System.out.println("Mengubah teman pada indeks 2 menjadi 'Joko'");
        daftarTeman.setNama(2, "Joko");
        daftarTeman.showTeman();

        System.out.println("Apakah 'Marcella' ada? " + daftarTeman.isMember("Marcella"));
        System.out.println("Apakah 'Budi' ada? " + daftarTeman.isMember("Budi"));

        System.out.println("Mengganti nama 'Marcella' menjadi 'Luna'");
        daftarTeman.gantiNama("Marcella", "Luna");
        daftarTeman.showTeman();

        System.out.println("Jumlah kemunculan nama 'Tamima': " + daftarTeman.countNama("Tamima"));

        System.out.println("Menghapus nama 'Joko'");
        daftarTeman.delNama("Joko");
        daftarTeman.showTeman();
        System.out.println("Sisa banyaknya teman: " + daftarTeman.getNbelm());
    }
}