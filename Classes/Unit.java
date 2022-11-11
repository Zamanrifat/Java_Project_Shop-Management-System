package classesh;
import java.lang.*;
public class Unit extends Facility
{
    private String indoor_unit;
    private String outdoor_unit;
    public Unit()
    {

    }
    public Unit(String indoor_unit,String outdoor_unit)
    {
        this.indoor_unit=indoor_unit;
        this.outdoor_unit=outdoor_unit;
    }
    public void setIndoorunit(String indoor_unit)
    {
        this.indoor_unit=indoor_unit;
    }
    public void setOutdoorunit(String outdoor_unit)
    {
        this.outdoor_unit=outdoor_unit;
    }
    public String getIndoorunit()
    {
        return indoor_unit;
    }
    public String getOutdoorunit()
    {
    return outdoor_unit;
    }
        public void showInfo()
    {
        System.out.println("Indoor Unit Product:"+indoor_unit);
        System.out.println("Outdoor Unit Product:"+outdoor_unit);
    }
}