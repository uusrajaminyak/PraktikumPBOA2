/* Nama File    : PNS.java */
/* Deskripsi    : berisi atribut dan method untuk objek PNS */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    // Atribut
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "Alamat belum diisi", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Method override
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(this.tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 4;
    }

    @Override
    public Double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                 : " + nip + "\n");
    }
}
