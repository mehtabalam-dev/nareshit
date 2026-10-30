package exceptionPrograms;
import java.util.Scanner;

class SalaryCalculationException extends Exception
{
    public SalaryCalculationException(String message)
    {
        super(message);
    }
}

public class SalaryProceesingPipeline
{

     public static void main(String[] args) //throws SalaryCalculationException
    {
        Scanner sc = new Scanner(System.in);

        double baseSalary = sc.nextDouble();
        double bonus = sc.nextDouble();

        try
        {
            PayrollSystem.calculateGross(baseSalary, bonus);
            System.out.println("Age: "+PracticeQsn01.age);
        }
        catch (SalaryCalculationException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

class PayrollSystem
{
    static void calculateGross(double baseSalary, double bonus) throws SalaryCalculationException
    {
  
        calculateTax(baseSalary,bonus);
    }

    static void calculateTax(double baseSalary, double bonus) throws SalaryCalculationException
    {
  
        generatePayslip(baseSalary,bonus);
    }

    static void generatePayslip(double baseSalary, double bonus)throws SalaryCalculationException
    {
 
        if (baseSalary < 0 || bonus < 0)
        {
            throw new SalaryCalculationException("Invalid salary data");
        }
        else
        {
           System.out.println("Payslip generated");
        }

    }
}