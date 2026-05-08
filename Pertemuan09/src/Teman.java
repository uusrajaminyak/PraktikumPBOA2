/* Nama File    : Teman.java */
/* Deskripsi    : Kelas Teman */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

import java.util.*;

public class Teman {
    // Atribut
    private Integer nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    // Method
    public Integer getNbelm() {
        return Lnama.size();
    }

    public String getNama(Integer i) {
        if (i >= 0 && i <= Lnama.size()) {
            return Lnama.get(i);
        } else {
            return null;
        }
    }

    public void setNama(Integer i, String nama) {
        if (i >= 0 && i <= Lnama.size()) {
            Lnama.set(i, nama);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int i = Lnama.indexOf(namaLama);
        if (i == -1) {
            System.out.println("Nama tidak ditemukan.");
        } else {
            Lnama.set(i, namaBaru);
        }
    }

    public Integer countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String nama : Lnama) {
            System.out.println("[+] " + nama);
        }
    }
}
