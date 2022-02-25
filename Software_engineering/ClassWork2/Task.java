package ClassWork2;

public class Task {
	
	//constructors
	
	public Task()
	{
		task_name="";
		days_desired=0;
		days_actual=0;
	}
	
	public Task(String name,int des,int act)
	{
		task_name=name;
		days_desired=des;
		days_actual=act;
	}
	
	//variables
	
	private String task_name;
	private int days_desired;
	private int days_actual;
	
	//getters + setters
	public String get_name()
	{
		return task_name;
	}
	
	public int get_days_desired()
	{
		return days_desired;
	}
	
	public int get_days_actual()
	{
		return days_actual;
	}
	
	public void set_name(String name)
	{
		task_name=name;
	}
	
	
	public void set_days_desired(int des)
	{
		days_desired=des;
	}
	
	public  void set_days_actual(int act)
	{
		days_actual= act;
	}
	
	//other methods
	
	public int check_time()
	{
		if(days_actual>days_desired)
		{
			
			System.out.printf("%s took more time then desired\n",task_name);
			return 1;
		}
		
		else if(days_actual<days_desired)
		{
			System.out.printf("%s took less time then desired\n",task_name);
			return -1;
		}
		
		else
		{
			System.out.printf("%s took the same time as desired\n",task_name);
			return 0;
		}
	}
}
