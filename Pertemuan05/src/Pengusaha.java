/* Nama File    : Pengusaha.java */
/* Deskripsi    : berisi atribut dan method untuk objek Pengusaha */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    // Atribut
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstruktor
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Method override
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(this.tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 1;
    }

    @Override
    public Double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp + "\n");
    }

}
