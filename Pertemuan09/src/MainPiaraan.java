/* Nama File    : MainPiaraan.java */
/* Deskripsi    : Aplikasi untuk menguji kelas Piaraan */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinikHewan = new Piaraan();

        Kucing k1 = new Kucing("Luna", 4.5); 
        Anggora k2 = new Anggora("Snowy", 5.2);
        Kembangtelon k3 = new Kembangtelon("Belang", 3.8);
        Anjing a1 = new Anjing("Rex");
        Burung b1 = new Burung("Rio");

        klinikHewan.enqueueAnabul(k1);
        klinikHewan.enqueueAnabul(a1);
        klinikHewan.enqueueAnabul(k2);
        klinikHewan.enqueueAnabul(b1);
        klinikHewan.enqueueAnabul(k3);

        System.out.println("Jumlah antrean saat ini: " + klinikHewan.getNbelm());

        System.out.print("Urutan panggilan: \n");
        klinikHewan.showAnabul();

        System.out.println("Detail Antrean Berdasarkan Jenis:");
        klinikHewan.showJenisAnabul();

        System.out.println("\nApakah 'Snowy' ada di antrean? " + klinikHewan.isMember(k2));

        System.out.println("\nBanyaknya keluarga kucing dalam antrean: " + klinikHewan.countKucing() + " ekor");

        System.out.println("\nTotal bobot keluarga kucing dalam antrean: " + klinikHewan.bobotKucing() + " kg");

        System.out.println("\nAnabul yang dipanggil pertama: " + klinikHewan.getAnabul().getNama());

        Anabul selesaiDiperiksa = klinikHewan.dequeueAnabul();
        System.out.println(selesaiDiperiksa.getNama() + " sudah selesai diperiksa dan keluar antrean.\n");

        System.out.print("Sisa antrean: \n");
        klinikHewan.showAnabul();
        System.out.println("Sisa jumlah antrean: " + klinikHewan.getNbelm());
    }
}