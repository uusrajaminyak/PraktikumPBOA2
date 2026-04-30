/* Nama File    : Datum.java */
/* Deskripsi    : Kelas generik Datum */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 27 April 2026 */

public class Datum<T> {
    private T isi;

    public T getIsi() {
        return this.isi;
    } 

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}