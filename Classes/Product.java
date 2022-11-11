package classesh;
public class Product
{
    
    private String name;
    private String location;
    Shop shop;
    public Product()
    {
        
    }
    public Product(String name,String location)
    {
        this.name=name;
        this.location=location;
        
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public void setShop(Shop shop)
    {
        this.shop=shop;
    }
    public Shop getShop()
    {
        return shop;
    }
    public void insertShop(Shop shop)
	{
		this.shop=shop;
	}
	   
    public String getName()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }
    
    public void showDetails()
    {
        System.out.println(" Product Name: "+name);
        System.out.println(" Product Location: "+location);
		System.out.println(" Shop Name: "+shop.getName());
        System.out.println(" Shop Location: "+shop.getAddress());
		//shop.displayInfo();

    }
	
}



