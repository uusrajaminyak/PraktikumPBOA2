/* Nama File    : MMahasiswa.java */
/* Deskripsi    : berisi atribut dan method untuk objek Mahasiswa */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("MK001", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MK002", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("M001", "Rusdi", "Sastra Jawa");
        Dosen D1 = new Dosen("D001", "Ir. Moeljono", "Sejarah");
        Kendaraan K1 = new Kendaraan("H 6580 JL", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        System.out.println("\nDetail Mahasiswa:");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
        System.out.println("Total SKS: " + M1.getSKS());
    }
}