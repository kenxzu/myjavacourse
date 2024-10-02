/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author knmor
 */
public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, 
            double commisionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("base must me >= 0.0");
        this.baseSalary =   baseSalary;
    }
    
   public void setBaseSalary(double baseSalary)
   {
       if(baseSalary < 0.0){
           throw new IllegalArgumentException("Base Salary Must be >=0");
       }
       
       this.baseSalary = baseSalary;
   }
   
   public double getbaseSalary(){
       return baseSalary;
   }
   
   @Override
   public double earnigs()
   {
       return getbaseSalary() + super.earnigs();
   }
   
   
   
   @Override
   public String toString()
   {
    /*   return String.format(
               "%s : %s %s%n%s : %s%n%s: %.2f%n%s : %.2f%n%s : %.2f%n",
                "commision employee", firstName, lastName, "Social Security Number", socialSecurityNumber,
                "gross sales", grossSales, "Commision Rate", commisionRate, "Base Salary", baseSalary
                );
      */
       
       return String.format(
               "%s %s%n%s: %.2f",
                "base salaried", super.toString(), "Base Salary", getbaseSalary()
                );
   }
   
    
    
    
}
