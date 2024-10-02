/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import java.util.Scanner;

/**
 *
 * @author knmor
 */
public class MediaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int pilih;

        do {
           
            System.out.println("========");
            System.out.println("Menu Media :");
            System.out.println("1. Buku");
            System.out.println("2. Video");
            System.out.println("3. Exit");
            System.out.print("Masukan pilihan: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    
                    System.out.print("Masukan judul buku: ");
                    String judulBuku = input.nextLine();
                    System.out.print("Masukan deskripsi buku: ");
                    String deskripsiBuku = input.nextLine();
                    System.out.print("Masukan penulis buku: ");
                    String penulis = input.nextLine();
                    System.out.print("Masukan tahun rilis buku: ");
                    int tahunRilis = input.nextInt();
                    System.out.print("Masukan jumlah halaman buku: ");
                    int jumlahHalaman = input.nextInt();
                    input.nextLine(); 

        
                    Buku buku = new Buku(judulBuku, deskripsiBuku, penulis, tahunRilis, jumlahHalaman);
                    System.out.println("Informasi Buku yang Anda masukan:");
                    buku.tampilkanInfo();
                    break;

                case 2:
               
                    System.out.print("Masukan judul video: ");
                    String judulVideo = input.nextLine();
                    System.out.print("Masukan deskripsi video: ");
                    String deskripsiVideo = input.nextLine();
                    System.out.print("Masukan pembuat video: ");
                    String pembuat = input.nextLine();
                    System.out.print("Masukan durasi video (menit): ");
                    int durasi = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Masukan tanggal buat video (YYYY-MM-DD): ");
                    String tanggalBuat = input.nextLine();

                
                    Video video = new Video(judulVideo, deskripsiVideo, pembuat, durasi, tanggalBuat);
                    System.out.println("Informasi Video yang Anda masukan:");
                    video.tampilkanInfo();
                    break;

                case 3:
              
                    System.out.println("Keluar dari program.");
                    break;

                default:
              
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }

            System.out.println(); 

        } while (pilih != 3); 

        input.close(); 
    }
        
    }
    






