/* Nama File    : MainOperatorGenerik.java */
/* Deskripsi    : Aplikasi prosedur & fungsi generik kelas OperatorGenerik */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class MainOperatorGenerik {
    public static void main(String[] args) {
        Datum<Integer> aInt = new Datum<>();
        aInt.setIsi(10);
        Datum<Integer> bInt = new Datum<>();
        bInt.setIsi(20);

        System.out.println("Sebelum ditukar:");
        System.out.println("aInt: " + aInt.getIsi());
        System.out.println("bInt: " + bInt.getIsi());

        OperatorGenerik.Tukar(aInt, bInt);

        System.out.println("Setelah ditukar:");
        System.out.println("aInt: " + aInt.getIsi());
        System.out.println("bInt: " + bInt.getIsi());

        Datum<String> aStr = new Datum<>();
        aStr.setIsi("King");
        Datum<String> bStr = new Datum<>();
        bStr.setIsi("Nasir");

        System.out.println("Sebelum ditukar:");
        System.out.println("aStr: " + aStr.getIsi());
        System.out.println("bStr: " + bStr.getIsi());

        OperatorGenerik.Tukar(aStr, bStr);

        System.out.println("Setelah ditukar:");
        System.out.println("aStr: " + aStr.getIsi());
        System.out.println("bStr: " + bStr.getIsi());

        Datum<Anabul> aAnabul = new Datum<>();
        aAnabul.setIsi(new Anjing("Spike"));
        Datum<Anabul> bAnabul = new Datum<>();
        bAnabul.setIsi(new Kucing("Tom", 5.5));

        System.out.println("Sebelum ditukar:");
        System.out.println("aAnabul: " + aAnabul.getIsi().getNama());
        System.out.println("bAnabul: " + bAnabul.getIsi().getNama());

        OperatorGenerik.Tukar(aAnabul, bAnabul);

        System.out.println("Setelah ditukar:");
        System.out.println("aAnabul: " + aAnabul.getIsi().getNama());
        System.out.println("bAnabul: " + bAnabul.getIsi().getNama());

        Anggora kucingAnggora = new Anggora("Yuki", 4.5);
        Kembangtelon kucingKembangtelon = new Kembangtelon("Indra", 3.2);

        double totalBobot = OperatorGenerik.Bobot2(kucingAnggora, kucingKembangtelon);
        System.out.println("Bobot Kucing Anggora: " + kucingAnggora.getBobot() + " kg");
        System.out.println("Bobot Kucing Kembangtelon: " + kucingKembangtelon.getBobot() + " kg");
        System.out.println("Total Bobot: " + totalBobot + " kg");
    }
}
