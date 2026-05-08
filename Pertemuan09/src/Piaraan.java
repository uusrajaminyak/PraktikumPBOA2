/* Nama File    : Piaraan.java */
/* Deskripsi    : Kelas Piaraan */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 4 Mei 2026 */

import java.util.*;

public class Piaraan {
    // Atribut
    private Integer nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    // Method
    public Integer getNbelm() {
        return Lanabul.size();
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        return Lanabul.poll();
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " ");
        }
        System.out.println();
    }

    public Integer countKucing() {
        int count = 0;
        for (Anabul k : Lanabul) {
            if (k instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public Double bobotKucing() {
        double totalberat = 0;
        for (Anabul k : Lanabul) {
            if (k instanceof Kucing) {
                totalberat += k.getBerat();
            }
        }
        return totalberat;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + ", " + a.getClass().getSimpleName());
        }
    }
}
