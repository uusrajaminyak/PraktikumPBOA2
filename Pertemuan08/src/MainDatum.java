/* Nama File    : MainDatum.java */
/* Deskripsi    : Aplikasi kelas generik Datum */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class MainDatum {
    public static void main(String[] args) {
        Anggora kucingAnggora = new Anggora("Yuki", 4.5);
        Kembangtelon kucingKembangtelon = new Kembangtelon("Indra", 3.2);

        Datum<Anggora> datumAnggora = new Datum<>();
        datumAnggora.setIsi(kucingAnggora);

        System.out.println("Nama kucing Anggora: " + datumAnggora.getIsi().getNama());
        System.out.println("Bobot kucing Anggora: " + datumAnggora.getIsi().getBobot() + " kg");

        Datum<Kembangtelon> datumKembangtelon = new Datum<>();
        datumKembangtelon.setIsi(kucingKembangtelon);

        System.out.println("Nama kucing Kembangtelon: " + datumKembangtelon.getIsi().getNama());
        System.out.println("Bobot kucing Kembangtelon: " + datumKembangtelon.getIsi().getBobot() + " kg");
    }
}
