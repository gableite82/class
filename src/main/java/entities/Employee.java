package entities;

public class Employee {
    public String emplyeeName;

    public double grossSalary;
    public double tax;

    public double addTax;


    @Override
    public String toString(){
        return "NAME: " + emplyeeName  + "\n" +
                "GROSS SALARY: " + String.format("%.2f", grossSalary) + "\n" +
                "TAX: " + String.format("%.2f", tax);
    }

    public double netSalary(){
         return grossSalary - tax;
    }

    public void addPercentage(double addTax){
        grossSalary += grossSalary * addTax / 100.0;;
    }
}