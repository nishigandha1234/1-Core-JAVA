/*Scenario 2: Hospital Management System*/

import java.util.Scanner;

class Patient
{
    String patientId;
    String name;
    int age;
    String disease;
    int roomNo;

    static String hospitalName = "Kamalnayan Hospital";
    static int totalPatients = 0;

    Patient(String patientId, String name, int age, String disease, int roomNo)
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.roomNo = roomNo;

        totalPatients++;
    }

    public void updateRoomNumber(int roomNo)
    {
        this.roomNo = roomNo;
        System.out.println("Room Number Updated Successfully...!");
    }

    public void display()
    {
        System.out.println("\n-------Display Patient Details--------");
        System.out.println("Patient Id : " + patientId);
        System.out.println("Patient Name : " + name);
        System.out.println("Patient Age : " + age);
        System.out.println("Patient Disease : " + disease);
        System.out.println("Patient Room Number : " + roomNo);
        System.out.println("Hospital : " + hospitalName);
    }

    public static int registerPatient()
    {
        return totalPatients;
    }
}

public class HospitalManagementSystem2
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        Patient[] p = new Patient[500];

        int count = 0;

        p[count++] = new Patient("P101", "Ram", 25, "Fever", 101);
        p[count++] = new Patient("P102", "Sita", 40, "Diabetes", 102);
        p[count++] = new Patient("P103", "Mohan", 30, "Covid", 103);

        do
        {
            System.out.println("\n--------WELCOME TO HOSPITAL MANAGEMENT SYSTEM--------");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patient");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Room Number");
            System.out.println("5. Discharge Patient");
            System.out.println("6. Total Patient");
            System.out.println("7. EXIT");
            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter Patient Id : ");
                    String id = sc.next();

                    sc.nextLine();

                    System.out.print("Enter Patient Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Patient Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Patient Disease : ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Patient Room Number : ");
                    int roomNo = sc.nextInt();

                    p[count++] = new Patient(id, name, age, disease, roomNo);

                    System.out.println("Patient Registered Successfully...");
                    break;
                }

                case 2:
                {
                    if(count == 0)
                    {
                        System.out.println("No Patients Found...");
                    }
                    else
                    {
                        for(int i = 0; i < count; i++)
                        {
                            if(p[i] != null)
                            {
                                p[i].display();
                            }
                        }
                    }
                    break;
                }

                case 3:
                {
                    System.out.print("Enter Patient Id to Search : ");
                    String id = sc.next();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(p[i] != null && p[i].patientId.equals(id))
                        {
                            p[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Patient Not Found...");
                    }

                    break;
                }

                case 4:
                {
                    System.out.print("Enter Patient ID : ");
                    String id = sc.next();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(p[i] != null && p[i].patientId.equals(id))
                        {
                            System.out.print("Enter New Room Number : ");
                            int roomNo = sc.nextInt();

                            p[i].updateRoomNumber(roomNo);

                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Patient Not Found...");
                    }

                    break;
                }
				case 5:
				{
					System.out.print("Enter Patient ID to Discharge : ");
					String id = sc.next();
					boolean found = false;
					for(int i = 0; i < count; i++)
					{
						if(p[i] != null && p[i].patientId.equals(id))
						{
							p[i] = null;
							Patient.totalPatients--;
							found = true;
							System.out.println("Patient Removed Successfully...");
							break;
						}
					}
					if(!found)
					{
						System.out.println("Patient Not Found...");
					}
					break;
				}
                case 6:
                {
                    System.out.println("Total Patients : " + Patient.totalPatients);
                    break;
                }

                case 7:
                {
                    System.out.println("Thank You...");
                    System.exit(0);
                }

                default:
                {
                    System.out.println("Invalid Choice...");
                }
            }

        } while(true);
    }
}