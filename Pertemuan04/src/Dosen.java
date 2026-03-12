/* Nama File    : Dosen.java */
/* Deskripsi    : berisi atribut dan method untuk objek Dosen */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Kamis, 12 Maret 2026 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nama, String nip, LocalDate tanggalLahir, LocalDate tmt, Double gajiPokok, String fakultas) {
        super(nama, nip, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
