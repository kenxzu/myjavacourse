/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

/**
 *
 * @author knmor
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("program menyusun semua susunan yang mungkin dari 1234");
        // Loop untuk semua kemungkinan angka pertama
        for (int i = 1; i <= 4; i++) {
            // Loop untuk semua kemungkinan angka kedua
            for (int j = 1; j <= 4; j++) {
                if (j == i) continue; // Lewati jika angkanya sudah digunakan

                // Loop untuk semua kemungkinan angka ketiga
                for (int k = 1; k <= 4; k++) {
                    if (k == i || k == j) continue; // Lewati jika angkanya sudah digunakan

                    // Loop untuk semua kemungkinan angka keempat
                    for (int l = 1; l <= 4; l++) {
                        if (l == i || l == j || l == k) continue; // Lewati jika angkanya sudah digunakan

                        // Cetak hasil permutasi
                        System.out.println(i + "" + j + "" + k + "" + l);
                    }
                }
            }
        }
    }
    
}
