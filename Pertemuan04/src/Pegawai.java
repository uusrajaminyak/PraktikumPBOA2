/* Nama File    : Pegawai.java */
/* Deskripsi    : berisi atribut dan method untuk objek Pegawai */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Kamis, 12 Maret 2026 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected Double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, Double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    protected String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    protected String formatRupiah(Double amount) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formatted = formatRupiah.format(amount);
        return formatted.replace("Rp", "Rp ").replace(",00", ",00");
    }

    public abstract void printInfo();
}
