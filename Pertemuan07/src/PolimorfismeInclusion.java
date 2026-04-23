/* Nama File    : PolimorfismeInclusion.java */
/* Deskripsi    : Realisasi Polimorfisme Inclusion */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class PolimorfismeInclusion {
    public static void main(String[] args) {
        Anabul kucingPersia = new Kucing("Cyrus the Great");
        Anabul anjingBulldog = new Anjing("Churchill");
        Anabul burungPipit = new Burung("Jack Sparrow");

        System.out.println("Simulasi Kucing");
        kucingPersia.Gerak();
        kucingPersia.Bersuara();

        System.out.println("\nSimulasi Anjing");
        anjingBulldog.Gerak();
        anjingBulldog.Bersuara();

        System.out.println("\nSimulasi Burung");
        burungPipit.Gerak();
        burungPipit.Bersuara();
    }
}
