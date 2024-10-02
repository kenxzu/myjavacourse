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
       /*jadi untuk mencari semua kemunkinan saya harus menggunakan perulangan bersarang ini.
4 slot untuk setiap tempat angka disini jadi disini saya hanya perlu 4 loop.
dengan syarat lanjut jika setiap angkanya sudah digunakan..
       dimulai dengan mencari semua kemungkinan angka pertama sebagai angka pertama
       lalu lanjut angka kedua dan seterusnya..<>
*/
        System.out.println("program menyusun semua susunan yang mungkin dari 1234");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == i) continue; 
                for (int k = 1; k <= 4; k++) {
                    if (k == i || k == j) continue; 
                    for (int l = 1; l <= 4; l++) {
                        
                        if (l == i || l == j || l == k) continue;
                        
                        System.out.println(i + "" + j + "" + k + "" + l);
                    }
                }
            }
        }
    }
    
}
