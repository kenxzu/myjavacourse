/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author knmor
 */
public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan angka ganjin: ");
        int nilai = scanner.nextInt();

 
        int m = 3 * nilai;

  
        if (nilai % 2 == 1) {

            // bagian atas 
            for (int i = 1; i < nilai; i += 2) {
                String pattern = ".|.".repeat(i);
                int padding = (m - pattern.length()) / 2;
                String pad = "-".repeat(padding);
                System.out.println(pad + pattern + pad);
            }

            // tegah 'WELCOME'
            int padding = (m - "WELCOME".length()) / 2;
            String pad = "-".repeat(padding);
            System.out.println(pad + "WELCOME" + pad);

            // bagian bawah
            for (int i = nilai - 2; i > 0; i -= 2) {
                String pattern = ".|.".repeat(i);
                padding = (m - pattern.length()) / 2;
                pad = "-".repeat(padding);
                System.out.println(pad + pattern + pad);
            }

        } else {
            System.out.println("tolomg masukan angka valid");
            scanner.close();
            return;  //kluar jika bukan angka ganjudi
        }

        System.out.println("1. Cek Bilangan Palindrom");
        System.out.println("2. Cek String Palindrom");
        System.out.println("3. Menghapus substring dari sebuah string");
        System.out.println("4. Exit");
        System.out.print("Masukan pilihan Anda : ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // menghilangkan bufffer

        switch (choice) {
            case 1:
                // ceeek palindrom
                int r, sum = 0, temp;
                System.out.print("Enter the number to check: ");
                int n = scanner.nextInt();
                temp = n;
                while (n > 0) {
                    r = n % 10;
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
                if (temp == sum) {
                    System.out.println("angka palindrom.");
                } else {
                    System.out.println("angka bukan palindrom.");
                }
                break;

            case 2:
                // Check if string is a palindrome
                System.out.print("Masukan String : ");
                String original = scanner.nextLine();
                String reverse = new StringBuilder(original).reverse().toString();

                if (original.equals(reverse)) {
                    System.out.println("String palindrom");
                } else {
                    System.out.println("string bukan palindrom");
                }
                break;

            case 3:
      
                System.out.print("Masukan String: ");
                String fullString = scanner.nextLine();
                System.out.print("masukan yang akan dihapus : ");
                String substringToDelete = scanner.nextLine();

                String result = fullString.replace(substringToDelete, "");
                System.out.println("setelah dihapus: " + result);
                break;

            case 4:
                System.out.println("keluar.");
                break;

            default:
                System.out.println("masukan infutan pvalid ");
                break;
        }

        scanner.close();
    }
}
