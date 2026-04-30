/* Nama File    : MainData.java */
/* Deskripsi    : Aplikasi dari kelas Data */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class MainData {
    public static void main(String[] args) {
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Kucing("Nasir", 2.7));
        dataAnabul.setIsi(2, new Anjing("Spike"));
        dataAnabul.setIsi(67, new Anggora("Yuki", 3.1));
        dataAnabul.setIsi(105, new Kembangtelon("Indra", 2.5));

        Anabul anabul1 = dataAnabul.getIsi(1);
        Anabul anabul2 = dataAnabul.getIsi(2);
        Anabul anabul67 = dataAnabul.getIsi(67);
        Anabul anabul105 = dataAnabul.getIsi(105);

        Anabul anabulKosong = dataAnabul.getIsi(50);
        System.out.println("Anabul pada indeks 50: " + anabulKosong);
        System.out.println("Jumlah Anabul: " + dataAnabul.getSize());

        if (anabul1 != null) {
            System.out.println("Anabul pada indeks 1: " + anabul1.getNama() + ", Bobot: " + ((Kucing) anabul1).getBobot() + " kg");
        }

        if (anabul2 != null) {
            System.out.println("Anabul pada indeks 2: " + anabul2.getNama());
        }

        if (anabul67 != null) {
            System.out.println("Anabul pada indeks 67: " + anabul67.getNama() + ", Bobot: " + ((Anggora) anabul67).getBobot() + " kg");
        }

        if (anabul105 != null) {
            System.out.println("Anabul pada indeks 105: " + anabul105.getNama() + ", Bobot: " + ((Kembangtelon) anabul105).getBobot() + " kg");
        }
    }
}
