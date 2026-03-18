/* Nama File    : Petani.java */
/* Deskripsi    : berisi atribut dan method untuk objek Petani */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0;

    // Konstruktor
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Method override
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(this.tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 1;
    }

    @Override
    public Double hitungPajak() {
        return 0.0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota + "\n");
    }
}
