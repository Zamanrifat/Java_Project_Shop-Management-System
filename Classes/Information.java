package classesh;
public class Information extends Shop
{
	private String name;
	private String id;
	private String gender;
	public Information()
	{
		
	}
	public Information(String name,String id,String gender)
	{
		this.name=name;
		this.id=id;
		this.gender=gender;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setID(String id)
	{
		this.id=id;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return id;
	}
	public String getGender()
	{
		return gender;
	}

}
