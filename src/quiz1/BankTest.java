package quiz1;

import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Account Holder : ");
        String nama = input.nextLine();
        System.out.print("Account Number : ");
        int accnum = input.nextInt();
        BankAccount account = new BankAccount(accnum, nama, 0, 0);

        int choice;

        String continueChoice;
        do {
            System.out.println();
            System.out.println("AccHolder : " + account.getAccountHolder());
            System.out.println("AccNumber : " + account.getAccountNumber());
            System.out.println("ATM BANK SENTOSA");
            System.out.println("Menu Pilihan: ");
            System.out.println("1. Tarik Tunai");
            System.out.println("2. Deposit");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Exit");
            System.out.print("Pilih 1 - 4 : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukan jumlah Tarik Tunai : ");
                    account.setWithdrawl(input.nextDouble());
                    System.out.println("Saldo setelah tarik tunai: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Masukan Jumlah deposit : ");
                    double depo = input.nextDouble();
                    account.setDeposit(depo);
                    break;

                case 3:
                    System.out.println("1. Check Saldo Sekarang");
                    System.out.println("2. Check Saldo Masa Depan");
                    System.out.println("Masukan Pilihan : ");
                    int pilih = input.nextInt();
                    if (pilih == 1) {
                        System.out.println("Saldo Sekarang: " + account.getBalance());
                    } else {
                        System.out.print("Masukan Jumlah Bulan: ");
                        int bulan = input.nextInt();
                        account.setFutureVal(bulan);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM BANK SENTOSA.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.print("Apakah Anda ingin melakukan transaksi lain? (y/n): ");
            continueChoice = input.next().toLowerCase();
            System.out.println();

        } while (continueChoice.equals("y"));
    input.close();
    }
    
}
