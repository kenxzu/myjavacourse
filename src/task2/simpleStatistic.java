/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author knmor
 */
public class simpleStatistic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====Menu=====");
        System.out.println("1. Mean");
        System.out.println("2. Median");
        System.out.println("3. Modus");
        System.out.println("4. Exit");

        System.out.print("Masukan Pilihan : ");
        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Jumlah Angka yang disimpan : ");
                int lenght = input.nextInt();
                int[] arr = new int[lenght];
                System.out.println("Masukan angka 0 - 1000");
                for (int i = 0; i < arr.length; i++) {
                    try {
                        int value = input.nextInt();

                        if (value < 0 || value > 1000) {
                            throw new IllegalArgumentException();
                        }

                        arr[i] = value;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Input diluar batas, element akan diisi dengan -1");
                        arr[i] = -1;
                    } catch (Exception e) {
                        System.out.println("Anda tidak memasukkan bilangan, element akan diisi dengan -1");
                        arr[i] = -1;
                        input.next();
                    }
                }

                double sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                double mean = sum / lenght;
                System.out.println("Rata-rata: " + mean);
                break;
                
            case 2:

                System.out.print("Jumlah Angka yang disimpan : ");
                int lenghtmedian = input.nextInt();
                int[] arr1 = new int[lenghtmedian];
                System.out.println("Masukan angka 0 - 1000");
                for (int i = 0; i < arr1.length; i++) {
                    try {
                        int value = input.nextInt();

                        if (value < 0 || value > 1000) {
                            throw new IllegalArgumentException();
                        }

                        arr1[i] = value;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Input diluar batas, element akan diisi dengan -1");
                        arr1[i] = -1;
                    } catch (Exception e) {
                        System.out.println("Anda tidak memasukkan bilangan, element akan diisi dengan -1");
                        arr1[i] = -1;
                        input.next();
                    }
                }
        
                    Arrays.sort(arr1);
                   
                        System.out.println(Arrays.toString(arr1));
                    
                

                    // Calculate median
                    if (arr1.length % 2 != 0) {
                        // Odd-length array: median is the middle element
                        System.out.println("Median: " + arr1[arr1.length / 2]);
                    } else {
                        // Even-length array: median is the average of the two middle elements
                        int middle1 = arr1.length / 2;
                        int middle2 = middle1 - 1;
                        System.out.println("Median: " + ((arr1[middle1] + arr1[middle2]) / 2.0));
                    }

                    input.close();
                    
                break;
            case 3: 
                break;
            default : 
                break;
                
                
        }
    }
}
    
                 
                    
                
        
       
    


