package classesh;
public class Appointment
{
    private String time;
    private String day;
    public Appointment()
    {
    }
    public Appointment(String time, String day)
    {
        this.time=time;
        this.day=day;
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public void setDay(String day)
    {
        this.day=day;
    }
    public String getTime()
    {
        return time;
    }
    public String getDay()
    {
        return day;
    }
}
