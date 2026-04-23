/* Nama File    : MainSeminar.java */
/* Deskripsi    : Aplikasi kelas Seminar */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class MainSeminar {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Benedict XVI", "123456789");
        Dosen d2 = new Dosen("Pius XII", "987654321");

        Mahasiswaa m1 = new Mahasiswaa("Saladin", "111111111");
        Mahasiswaa m2 = new Mahasiswaa("Charlegmane", "222222222");
        Mahasiswaa m3 = new Mahasiswaa("Louis XVI", "333333333");
        Mahasiswaa m4 = new Mahasiswaa("Richard I", "444444444");
        Mahasiswaa m5 = new Mahasiswaa("Baldwin IV", "555555555");

        Seminar s1 = new Seminar();

        System.out.println("Meregistrasi Peserta Seminar...");
        s1.registrasi(d1);
        s1.registrasi(d2);
        s1.registrasi(m1);
        s1.registrasi(m2);
        s1.registrasi(m3);
        s1.registrasi(m4);
        s1.registrasi(m5);

        System.out.println("\nJumlah Peserta Seminar: " + s1.countPeserta());
        System.out.println("Jumlah Mahasiswaa yang mengikuti Seminar: " + s1.countMahasiswa());

        s1.tampilPeserta();

        System.out.println("\nMenambahkan Dosen Wali untuk Mahasiswaa...");
        m1.setDosenWali(d1);
        m2.setDosenWali(d1);
        m3.setDosenWali(d2);
        m4.setDosenWali(d2);
        m5.setDosenWali(d2);

        System.out.println("\nMenampilkan Data Mahasiswaa...");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
