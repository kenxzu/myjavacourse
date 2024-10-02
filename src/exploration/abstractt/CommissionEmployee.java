/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration.abstractt;

/**
 *
 * @author knmor
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commision rate must be > 0.0 and < 1.0 ");
        }

        if (grossSales < 0) {
            throw new IllegalArgumentException(
                    "Gross Sales must be >= 0.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales(double grossSales)
    {
        if(grossSales < 0 )
            throw new IllegalArgumentException(
                    "Commsion must be >= 0 ");
        
        this.grossSales = grossSales;
        
    }
    
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setcommissionRate(double commissionRate)
    {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
            "commission rate range 0.0 - 1.0");
        
        this.commissionRate = commissionRate;
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override 
    public String toString(){
        return String.format("%s : %s%n%s: $%,.2f; %s: %.2f", 
                "commission employee", super.toString(), "grossSales", getGrossSales(), "commsion rate", getCommissionRate());
    }
    
    

}
