//Moch Helmi Hasan
//16
//1931710135
package uts1c_16;
import java.util.Arrays;
import java.util.Collections;
public class UTS1C_16 {
    public static void main(String[] args) {
        String judul;
        String kode[] = {"H","E","L","M","I"};
        int stok[] = {3,2,3,5,7};
        System.out.println("Kode\tJudul Buku\t\t\tStok");
        System.out.println("H\tMemasak Cepat\t\t\t3");
        System.out.println("E\tBercocok Tanam di Rumah\t\t2");
        System.out.println("L\tBrekreasi dengan Batik\t\t3");
        System.out.println("M\tBelajar Sholat Khusuk\t\t5");
        System.out.println("I\tRamadhan Berkah\t\t\t7");
        System.out.println("Sorting kode");
        Arrays.sort(kode);
        for (String x : kode) {
            System.out.println(x);
        }
    }
    
}
