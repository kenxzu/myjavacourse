/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exploration;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author knmor
 */
public class Currencyprecision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        BasePlusCommisionEmployee emp1 = new BasePlusCommisionEmployee(
        "Ken", "foster", "0823-4310-4969", 5000, .04, 300); 
        //ini juga akan mengisi construktor dari super type//
        
        
        
       
        System.out.printf("%s : %s%n","first name", emp1.getFirstName());
        System.out.printf("%s : %s%n","last name", emp1.getLastName());
        System.out.printf("%s : %s%n","gross sales", emp1.getGrossSales());
        System.out.printf("%s : %s%n","commision rate", emp1.getCommisionRate());
        System.out.printf("%s : %s%n","base salary", emp1.getbaseSalary());
        
        emp1.setBaseSalary(400);
        
        
        System.out.printf("%n%n%s : %n%n%s%n", "Updated employee information obtained", emp1);
        
        
       
//        BigDecimal principal = BigDecimal.valueOf(100000.0);
//        BigDecimal rate = BigDecimal.valueOf(0.05);
//        System.out.println("Starting calculations...");
//        for (int year = 1; year <= 10; year++) {
//            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
//            System.out.printf("%-4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
//            }
//        System.out.println("Calculations completed.");
    }
    
}
