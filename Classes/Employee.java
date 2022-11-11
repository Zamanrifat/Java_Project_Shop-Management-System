package classesh;
import interfacesh.*;
import java.lang.*;
public class Employee extends Information implements InterfaceEmployee
{
    private double salary;
   
   
    public Employee()
    {
       
    }
    public Employee(String name,String id,String gender,double salary)
    {
		super(name,id,gender);
        this.salary=salary;
       
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
   
    public void showInfo()
    {
        System.out.println("Employee Name: "+getName());
        System.out.println("Employee ID: "+getID());
        System.out.println("Employee Gender: "+getGender());
        System.out.println("Employee Salary: "+salary);
               
    }
}