package ClassWork2;

import java.util.LinkedList;

public class Employee {
	//constructors
	public Employee()
	{
		name="";
		ID=0;
		salary=0;
		bonus=0;
		task_list=new LinkedList<Task>();  
	}
	
	public Employee(String n,long id,double slry,double bns)
	{
		name=n;
		ID=id;
		salary=slry;
		bonus=bns;
		task_list=new LinkedList<Task>();  
	}
	
	//variables
	private String name;
	private long ID;
	private LinkedList<Task> task_list;
	private double salary;
	private double bonus;
	
	
	
	
	//getters+setters
	
	public String get_name()
	{
		return name;
	}
	
	public long get_ID()
	{
		return ID;
	}
	
	public LinkedList<Task> get_task_list()
	{
		return task_list;
	}
	
	public double get_salary()
	{
		return salary;
	}
	
	public double get_bonus()
	{
		return bonus;
	}
	
	public void set_name(String name)
	{
		this.name=name;
	}
	
	
	public void set_ID(long id)
	{
		ID=id;
	}
	
	public  void set_salary(double salary)
	{
		this.salary= salary;
	}
	
	public void set_bonus(double bns)
	{
		bonus=bns;
	}
	
	
	
	//other methods
	
	public void add_task(Task t)
	{
		task_list.add(t);
	}
	
	public double calc_bonus()
	{
		return 0;
	}
}
