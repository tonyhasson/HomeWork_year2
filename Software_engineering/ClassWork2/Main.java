package ClassWork2;

import java.util.Scanner;

public class Main {
	
	//input data about a task
	public static Task input_task(Scanner scan)
	{
		Task tsk=new Task();
		scan.nextLine();//added to catch \n
		System.out.println("enter task name:");
		tsk.set_name(scan.nextLine());
		
		System.out.println("enter desired days:");
		tsk.set_days_desired(scan.nextInt());
		
		System.out.println("enter actual days:");
		tsk.set_days_actual(scan.nextInt());
		
		return tsk;
	}
	
	
	//input data about a team member
	public static TeamMember input_team_member(Scanner scan)
	{
		TeamMember tmp=new TeamMember();
		System.out.println("enter name:");
		scan.nextLine();//added to catch \n
		tmp.set_name(scan.nextLine());
		
		System.out.println("enter ID:");
		tmp.set_ID(scan.nextLong());
		
		System.out.println("enter salary:");
		tmp.set_salary(scan.nextDouble());
		
		System.out.println("enter amount of tasks:");
		int amount_tasks=scan.nextInt();
		
		//input tasks
		for(int i=0;i<amount_tasks;i++)
		{
			System.out.printf("Now entering task number %d\n",i+1);
			tmp.add_task(input_task(scan));
		}
		
		
		return tmp;
	}
	
	//input data about the manager
	public static Manager input_manager(Scanner scan)
	{
		Manager mng=new Manager();		
		
		System.out.println("enter Manager name:");
		mng.set_name(scan.nextLine());
		
		System.out.println("enter Manager ID:");
		mng.set_ID(scan.nextLong());
		
		System.out.println("enter Manager salary:");
		mng.set_salary(scan.nextDouble());
		
		System.out.println("enter Manager starting bonus:");
		mng.set_bonus(scan.nextDouble());
		
		System.out.println("enter amount of tasks:");
		int amount_tasks=scan.nextInt();
		
		//input tasks
		for(int i=0;i<amount_tasks;i++)
		{
			System.out.printf("Now entering task number %d\n",i+1);
			mng.add_task(input_task(scan));
		}
		
		//input team members
		for(int i=0;i<2;i++)
		{
			System.out.printf("Now entering employee number %d\n",i+1);
			mng.add_member(input_team_member(scan));
		}
		
		return mng;
	}
	
	//print bonus for manager and his employees
	public static void print_bonus(Scanner scan,Manager mng)
	{
		for(int i=0;i<2;i++)
		{
			System.out.printf("Now calculating bonus for employee number %d\n",i+1);
			System.out.printf("the bonus is %f\n\n\n",mng.get_member_list().get(i).calc_bonus());
		}
		
		System.out.printf("Now calculating bonus for manager\n");
		System.out.printf("the bonus is %f\n", mng.calc_bonus());
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//input data into manager
		Manager mng=input_manager(scan);
		
		//print bonus for manager and his employees
		print_bonus(scan,mng);
		
		

	}

}
