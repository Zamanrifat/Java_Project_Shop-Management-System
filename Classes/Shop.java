package classesh;
import java.lang.*;

public class Shop
{
	private String hname;
	private String address;
	public Shop()
	{
		
	}
	public Shop(String hname,String address)
	{
		this.hname=hname;
		this.address=address;
	}
	public void setName(String hname)
	{
		this.hname=hname;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getName()
	{
		return hname;
	}
	public String getAddress()
	{
		return address;
	}
	public void displayInfo()
	{
		System.out.println(""+hname);
		System.out.println(""+address);
	}
}