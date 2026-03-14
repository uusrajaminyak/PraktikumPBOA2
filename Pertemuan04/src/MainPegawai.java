/* Nama File    : MainPegawai.java */
/* Deskripsi    : berisi realisasi dari atribut dan method untuk objek Pegawai */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Kamis, 12 Maret 2026 */

import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap Dosen1 = new DosenTetap(
            "123456789", "Budi",
            LocalDate.of(1970, 7, 8),
            LocalDate.of(2000, 1, 15),
            5000000.0, "Teknik Informatika", "987654321"
        );

        DosenTamu Dosen2 = new DosenTamu(
            "987654321", "Siti",
            LocalDate.of(1980, 3, 20),
            LocalDate.of(2020, 2, 1),
            3000000.0, "Teknik Elektro", "123456789", LocalDate.of(2028, 2, 1)
        );

        Tendik Tendik1 = new Tendik(
            "555555555", "Andi",
            LocalDate.of(1985, 5, 15),
            LocalDate.of(2010, 6, 1),
            4000000.0, "Laboratorium"
        );

        System.out.println("=== Informasi Dosen Tetap ===");
        Dosen1.printInfo();

        System.out.println("\n=== Informasi Dosen Tamu ===");
        Dosen2.printInfo();

        System.out.println("\n=== Informasi Tenaga Kependidikan ===");
        Tendik1.printInfo();
    }
}