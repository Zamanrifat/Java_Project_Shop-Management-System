package classesh;
import java.lang.*;
public class Store extends Facility
{
	private String stock1_room;
	private String stock2_room;
	public Store()
	{
		
	}
	public Store(String stock1_room,String stock2_room)
	{
		this.stock1_room=stock1_room;
		this.stock2_room=stock2_room;
	}
	public void setStock1room(String stock1_room)
	{
		this.stock1_room=stock1_room;
	}
	public void setStock2room(String stock2_room)
	{
		this.stock2_room=stock2_room;
	}
	public String getStock1room()
	{
		return stock1_room;
	}
	public String getStock2room()
	{
		return stock2_room;
	}
	public void showInfo()
	{
		System.out.println("Stock1 Room Indoor product:"+stock1_room);
		System.out.println("Stock2 Room Outdoor product:"+stock2_room);
	}
}