/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration.abstractt;

/**
 *
 * @author knmor
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if(baseSalary<0)
            throw new IllegalArgumentException(
            "Base Salary cannot be Less than or = 0");
        
        
        this.baseSalary = baseSalary;
       
    
    }
    
    
    public void setBaseSalary(double baseSalary)
    {
       
        if(baseSalary<0)
            throw new IllegalArgumentException(
            "Base Salary cannot be Less than or = 0");
        
        
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override 
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
    
}
