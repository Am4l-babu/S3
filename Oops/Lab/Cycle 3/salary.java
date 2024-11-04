import java.util.*;
class employee
{
			String name,address;
			int number,age,salary;
		void inputdetails()
		{
		Scanner s =new Scanner(System.in);	
		System.out.println("enter the name of the officer");
		name=s.nextLine();
		System.out.println("enter address of officer");
		address=s.nextLine();
		System.out.println("enter number of officer");
		number=s.nextInt();
		System.out.println("enter salary of officer");
		salary=s.nextInt();
		System.out.println("enter age of officer");
		age=s.nextInt();
		}
		
			
			 void printsalary()
			{
				System.out.println("EMPLOYEE DETAILS");
				System.out.println("\nsalary:"+salary);
			
			}
		}

		class officer extends employee
		{
		void officerdetails()
		{
		Scanner s = new Scanner(System.in);
		inputdetails();
		}
		void printoffdetails()
		{
		System.out.println("Name:"+name+"\nAge:"+age+"\nsalary:"+salary+"\nPhonemuber:"+number+"\nAddress:"+address);
		}
		}
		
		class manager extends employee
		{
		void mang(){
		inputdetails();
		Scanner s = new Scanner(System.in);
		}
		void displaymanager()
		{
		System.out.println("Name:"+name+"\nAge:"+age+"\nsalary:"+salary+"\nPhonemuber:"+number+"\nAddress:"+address);
		}
		}
		class action{
		public static void main(String args[])
		{
		officer obj = new officer();
		manager obj1= new manager();
		obj.officerdetails();
		obj.printoffdetails();
		obj1.displaymanager();
		obj1.mang();
		}
		}
