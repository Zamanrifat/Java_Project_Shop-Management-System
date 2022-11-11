import java.lang.*;
import java.util.Scanner;
import fileh.*;
import classesh.*;
import interfacesh.*;
public class Start
{
	public static void main(String []args)
	{
	Hospital h1=new Hospital("-----IBN SINA HOSPITAL-----","Progoti Soroni,Uttar Badda,Dhaka-1212");
	System.out.println("**********-WELCOME-**********");
	h1.displayInfo();
	System.out.println("");
	System.out.println("What would you like to  know?");
	System.out.println("    1.Information");
	System.out.println("    2.Facility");
	System.out.println("or Press 3 to know the Pharmacy location");
	int n;
	Scanner input = new Scanner(System.in);
	n=input.nextInt();
	switch(n)
	{
		case 1:
			{
			System.out.println("What Information do you need?");
			System.out.println("     1.Doctor");
			System.out.println("     2.Nurse");
			System.out.println("     3.Staff");
			System.out.println("     4.Patient");
			int m;
			Scanner i = new Scanner(System.in);
			m=i.nextInt();
				switch(m)
				{
					case 1:
					{
						System.out.println("The Doctors Information are given below");
						Doctor d1=new Doctor("Dr.A","112","Female","Child",34);
						d1.showInfo();
						System.out.println("");
						Doctor d2=new Doctor("Dr.B","113","Male","Eye",46);
						d2.showInfo();
						System.out.println("");
						Doctor d3=new Doctor("Dr.C","123","Female","Ortho",65);
						d1.showInfo();
						System.out.println("");
						System.out.println("Do you want to know the appointment schedule?");
						System.out.println("1.Yes");
						System.out.println("2.No");
						
							int m2;
							Scanner i2= new Scanner(System.in);
							m2=i2.nextInt();
							switch(m2)
							{
								case 1:
								{
									System.out.println("Which Doctor's Appointment Schedule You want to know?");
									System.out.println("1.Dr.A");
									System.out.println("2.Dr.B");
									System.out.println("3.Dr.C");
									int m3;
									Scanner i3=new Scanner(System.in);
									m3=i3.nextInt();
									switch(m3)
									{
										case 1:
										{
											Appointment a1=new Appointment("8.00am-10.00am","Monday");
											Appointment a2=new Appointment("11.00am-12.30pm","Tuesday");
											Appointment a3=new Appointment("10.00am-12.00pm","Thursday");
											d1.confirmAppointment(a1);
											d1.confirmAppointment(a2);
											d1.confirmAppointment(a3);
											d1.cancelAppointment(a1);
											d1.showAppointmentInformation();
											break;
										}
										case 2:
										{
											Appointment a11=new Appointment("9.00am-11.00am","Monday");
											Appointment a22=new Appointment("2.00pm-4.00pm","Tuesday");
											Appointment a33=new Appointment("7.00pm-9.00pm","Thursday");
											d2.confirmAppointment(a11);
											d2.confirmAppointment(a22);
											d2.confirmAppointment(a33);
											d2.showAppointmentInformation();
											d2.cancelAppointment(a11);
											d2.showAppointmentInformation();
											break;
										}
										case 3:
										{
											Appointment a111=new Appointment("8.00am-10.00am","Sunday");
											Appointment a222=new Appointment("11.00am-12.30pm","Wednesday");
											Appointment a333=new Appointment("10.00am-12.00pm","Sunday");
											d3.confirmAppointment(a111);
											d3.confirmAppointment(a222);
											d3.confirmAppointment(a333);
											d3.showAppointmentInformation();
											d3.cancelAppointment(a111);
											d3.showAppointmentInformation();
											break;
											
										}
									default:System.out.println("Have a Good Day^-^");
									break;
									}
									
								break;	
								}
								case 2:
								{
									System.out.println("Thank You");
									break;
								}
								default:System.out.println("");
								break;
							}
							
						break;
					}
					case 2:
					{
						System.out.println("The Nurse Information are given below");
						Nurse n1=new Nurse("Tin","1357","Female",12000.0);
						n1.showInfo();
						System.out.println("");
						Nurse n2=new Nurse("Min","1238","Female",10000.0);
						n2.showInfo();
						System.out.println("");
						Nurse n3=new Nurse("Tan","1782","Female",8000.0);
						n3.showInfo();
						InterfaceNurse.disp();
						break;
					}
					case 3:
					{
						System.out.println("The Staff Information are given below");
						Staff s1=new Staff("Div","13547","Male","Supervisor",10000.0);
						s1.showInfo();
						System.out.println("");
						Staff s2=new Staff("Beni","15238","Female","Receptionist",12000.0);
						s2.showInfo();
						System.out.println("");
						Staff s3=new Staff("Olive","17682","Male","Night-Guard",8000.0);
						s3.showInfo();
						break;
					}
					case 4:
					{
						/*System.out.println("The Patient Information are given below");
						Patient p1=new Patient("Div","13547","Male",45,"Fever");
						p1.displayinfo();
						System.out.println("");
						Patient p2=new Patient("Beni","15238","Female",8,"Cough");
						p2.displayinfo();
						System.out.println("");
						Patient p3=new Patient("Olive","17682","Male",45,"Corona");
						p3.displayinfo();*/
						Patient p1 = new Patient("Tanako", "231", "Male",20, "Corona");
						Patient p2 = new Patient("Minato","621", "Female",53, "Fever");
						Patient p3 = new Patient("Uenoyama","423", "Male",25, "Dengue");
						p1.displayinfo();
						Patient patients[] = new Patient[3];
						patients[0]=p1;
						patients[1]=p2;
						patients[2]=p3;
						System.out.println("--------------");
						patients[1].displayinfo();
						System.out.println("--------------");
						patients[2].displayinfo();
						InterfacePatient.disp();						
						break;
					}
					default:
					System.out.println("Go to Home Child");
					break;
				}
			break;
		}
		case 2:
		{
			System.out.println("Some of the Hospital facilities are given below");
			System.out.println("Which Hospital Facility You Want to Know?");
			System.out.println("     1.Lab");
			System.out.println("     2.Unit");
			System.out.println("     3.Room");
			int n2;
			Scanner f = new Scanner(System.in);
			n2=f.nextInt();
			switch(n2)
			{
				case 1:
				{
					System.out.println("-----Lab-----");
					Lab l1=new Lab("1212","1010");
					l1.showInfo();
					break;
				}
				case 2:
				{
					System.out.println("-----Unit-----");
					Unit u1=new Unit("12A","10A");
					u1.showInfo();
					break;
				}
				case 3:
				{
					System.out.println("-----Room-----");
					Room r1=new Room(20,30);
					r1.showInfo();
					break;
				}
				default:System.out.println("Invalid");
				break;	
			}
			break;
		}
	
			case 3:
			{
				Hospital h2=new Hospital("IBN SINA","Uttor Badda");
				Pharmacy p11=new Pharmacy("Drug House","Across the road of Progoti Soroni");
				
				p11.insertHospital(h2);
				p11.showDetails();
				break;
			}
		default:System.out.println("Invalid Choice");
		break;
	}
		FileReadWrite_Hospital frwd = new FileReadWrite_Hospital();
	
		System.out.println("----------------------");
		frwd.writeInFile("-----IBN SINA HOSPITAL-----");
		frwd.readFromFile();
		System.out.println("----------------------");
		frwd.writeInFile("Progoti Soroni,Uttar Badda,Dhaka-1212");
		frwd.readFromFile();
	 
	}

}
