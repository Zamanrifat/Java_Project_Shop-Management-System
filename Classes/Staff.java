package classesh;
import java.lang.*;
public class Staff extends Information
{
    private String designation;
    private double salary;  
    public Staff()
    {
       
    }
    public Staff(String name,String id,String gender,String designation,double salary)
    {
		super(name,id,gender);
        this.designation=designation;
        this.salary=salary;
       
    }
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
   
    public String getDesignation()
    {
        return designation;
    }
    public double getSalary()
    {
        return salary;
    }   
    public void showInfo()
    {
        System.out.println("Staff Name: "+getName());
        System.out.println("Staff ID: "+getID());
        System.out.println("Staff Gender: "+getGender());
        System.out.println("Staff Designation: "+designation);
        System.out.println("Staff Salary:"+salary);
               
    }
}