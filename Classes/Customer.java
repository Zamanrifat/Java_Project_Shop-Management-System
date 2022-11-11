package classesh;
import interfacesh.*;
import java.lang.*;
public class Customer extends Information implements InterfaceCustomer
{
    private int age;
    private String product;
    public Coustomer()
    {
    }
    public Customer(String name,String id,String gender,int age, String product)
    {
        super(name, id, gender);
        this.age = age;
        this.product = product;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void  setProduct(String product)
    {
        this.product = product;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getProduct()
    {
        return this.product;
    }
    
    public void displayinfo()
    {
        System.out.println("Name :" +getName());
        System.out.println("ID :" +getID());
        System.out.println("Gender :" +getGender());
        System.out.println("age :" +age);
        System.out.println("product :" +product);
    }

 

}