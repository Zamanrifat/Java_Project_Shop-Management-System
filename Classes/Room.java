package classesh;
public class Room extends Facility
{
    private int warehnum, cabinnum;
    public Room()
    {
    }
    public Room(int warehnum, int cabinnum)
    {
        this.warehnum = warehnum;
        this.cabinnum = cabinnum;
    }
    public void setWarehnum(int warehnum)
    {
        this.warehnum = warehnum;
    }
    public void setCabinNum(int cabinnum)
    {
        this.cabinnum = cabinnum;
    }
    public void showInfo()
    {
        System.out.println("Warehouse Number :"+warehnum);
        System.out.println("Cabin Number :"+cabinnum);
    }
}