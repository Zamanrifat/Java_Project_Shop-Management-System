package classesh;
import java.lang.*;
public class Owner extends Information
{
    private String section;
    int room;
    Appointment appointments[] = new Appointment[9];
    public Owner()
    {
      
    }
    public Owner(String name, String id, String gender, String section, int room)
    {
        super(name,id,gender);
        this.section=section;
        this.room=room;
    }
    public void setSection(String section)
    {
        this.section=section;
    }
    public void setRoom(int room)
    {
        this.room=room;
    }
    public String getSection()
    {
        return section;
    }
    public int getRoom(int room)
    {
        return room;
    }
    public void confirmAppointment(Appointment appointment)
    {
        int flag=0;
        for(int i=0;i<appointments.length;i++)  
        {
            if(appointments[i]== null)
            {
            appointments[i]=appointment;
            flag=1;
            break;
            }
        }
        if(flag==1)
        {
            System.out.println("Confirmed Appointment");
        }
        else
        {
            System.out.println("Appointment can not be confirmed");
        }
    }
    public void cancelAppointment(Appointment appointment)
    {
        int flag=0;
        for(int i=0;i<appointments.length;i++)
        {
            if (appointments[i]==appointment)
            {
                appointments[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Canceled Appointment");
        }
        else
        {
            System.out.println("Appointment can not be canceled");
        }
    }
     public void showInfo()
    {
        System.out.println("Owner Name: "+getName());
        System.out.println("Owner ID: "+getID());
        System.out.println("Owner gender: "+getGender());
        System.out.println("Section: "+section);
        System.out.println("Owner room: "+room);
             
    }
    public void showAppointmentInformation()
    {
        for(int i=0;i<appointments.length;i++)
        {
            if (appointments[i]!=null)
            {
                System.out.println("Appointment Time: "+appointments[i].getTime());
                System.out.println("Appointment Day : "+appointments[i].getDay());
            }
        }
    }
   
}
    