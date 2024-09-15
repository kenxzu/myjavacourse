/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author knmor
 */
public class simpleStatistic {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
          
        int pilihan;
          do{
        System.out.println("\n=====Menu=====");
        System.out.println("1. Mean");
        System.out.println("2. Median");
        System.out.println("3. Modus");
        System.out.println("4. Exit");

        System.out.print("Masukan Pilihan : ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1 -> {
                System.out.print("Jumlah Angka yang disimpan : ");
                int lenght = input.nextInt();
                int[] arr = new int[lenght];
                System.out.println("Masukan angka 0 - 1000");
                
                for (int i = 0; i < arr.length; i++) {
                    try {
                        System.out.print("Masukan Bilangan ke -" + (i+1) + ": ");
                        int value = input.nextInt();

                        if (value < 0 || value > 1000) {
                            throw new IllegalArgumentException();
                        }

                        arr[i] = value;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Input diluar batas, element akan diisi dengan -1");
                        arr[i] = -1;
                    } catch (InputMismatchException e) {
                        System.out.println("Anda tidak memasukkan bilangan, element akan diisi dengan -1");
                        arr[i] = -1;
                        input.nextLine();
                    }
                }
                
                System.out.println("Daftar Bilangan :"+ Arrays.toString(arr));

                double sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                double mean = sum / lenght;
                System.out.println("Rata-rata: " + mean);
                }

            case 2 -> {
                System.out.print("Jumlah Angka yang disimpan : ");
                int lenghtmedian = input.nextInt();
                int[] arr1 = new int[lenghtmedian];
                System.out.println("Masukan angka 0 - 1000");
                for (int i = 0; i < arr1.length; i++) {
                    try {
                        System.out.print("Masukan Bilangan ke -" + (i+1) + ": ");
                        int value = input.nextInt();

                        if (value < 0 || value > 1000) {
                            throw new IllegalArgumentException();
                        }

                        arr1[i] = value;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Input diluar batas, element akan diisi dengan -1");
                        arr1[i] = -1;
                    } catch (InputMismatchException e) {
                        System.out.println("Anda tidak memasukkan bilangan, element akan diisi dengan -1");
                        arr1[i] = -1;
                        input.nextLine();
                    }
                }

                Arrays.sort(arr1);

                System.out.println("Daftar Bilangan :"+ Arrays.toString(arr1));

                if (arr1.length % 2 != 0) {
                    // Odd-length array: median is the middle element
                    System.out.println("Median: " + arr1[arr1.length / 2]);
                } else {
                    // Even-length array: median is the average of the two middle elements
                    int middle1 = arr1.length / 2;
                    int middle2 = middle1 - 1;
                    System.out.println("Median : " + ((arr1[middle1] + arr1[middle2]) / 2.0));
                }
                }
                
            case 3 -> {
                System.out.print("Jumlah Angka yang disimpan : ");
                int lenghtmod = input.nextInt();
                int[] arrmod = new int[lenghtmod];
                System.out.println("Masukan angka 0 - 1000");
                
                for (int i = 0; i < arrmod.length; i++) {
                    try {
                        System.out.print("Masukan Bilangan ke -" + (i+1) + ": ");
                        int value = input.nextInt();

                        if (value < 0 || value > 1000) {
                            throw new IllegalArgumentException();
                        }

                        arrmod[i] = value;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Input diluar batas, element akan diisi dengan -1");
                        arrmod[i] = -1;
                    } catch (InputMismatchException e) {
                        System.out.println("Anda tidak memasukkan bilangan, element akan diisi dengan -1");
                        arrmod[i] = -1;
                        input.nextLine(); 
                    }
                }
                Arrays.sort(arrmod);
                System.out.println("Daftar Bilangan :"+ Arrays.toString(arrmod));
                int maxCount = 0;
                int maxValue = 0;

                for (int i = 0; i < arrmod.length; i++) {
                    int count = 0;
                    for (int j = 0; j < arrmod.length; j++) {
                        if (arrmod[i] == arrmod[j]) {
                            ++count;
                        }

                    }

                    if (count > maxCount) {
                        maxCount = count;
                        maxValue = arrmod[i];
                    }

                }
                
                System.out.println("Modus : " + maxValue + " sebanyak " + maxCount +" kali ");
                }

            case 4 -> {
                System.out.println("byebye");
                input.close();
                }
            default -> System.out.println("salah masukan ");

        }
    }while(pilihan != 4);
    }
}
