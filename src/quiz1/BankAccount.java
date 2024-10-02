/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author knmor
 */
public class BankAccount {
private int accountNumber;
private String accountHolder;
private double withdrawl, deposit, balance= 500000;
private double futureVal;
    public BankAccount(){       
    }

    public BankAccount(int accountNumber, String accountHolder, double withdrawl, double deposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.withdrawl = withdrawl;
        this.balance -= withdrawl;
        this.deposit = deposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public void setWithdrawl(double withdrawl) {
        if(withdrawl > this.balance ){
            System.out.println("saldo tidak cukup");
        }
        else{
            this.withdrawl = withdrawl;
            this.balance -= this.withdrawl;
        }
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        if(deposit < 100000){
            System.out.println("minimal deposit 100000");
        }else{
        this.deposit = deposit;
        this.balance += this.deposit;
        System.out.println("Saldo sekarang : " + this.balance);
        }

       
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
  public void setFutureVal(int period) { 
      //interest rate 5%;
    this.futureVal = this.balance * Math.pow(1 + 0.05, (double) period);  // Assuming a 5% interest rate
    System.out.println("Saldo Anda dalam " + period + " bulan adalah: " + this.futureVal);
}

    
    

  
    
    
    
    

    
    





    
}
