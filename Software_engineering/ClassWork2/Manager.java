package ClassWork2;

import java.util.LinkedList;

public class Manager extends Employee {
	
	
	//constructors
	public Manager()
	{
		super();
		member_list=new LinkedList<TeamMember>();
	}
	
	public Manager(String n,long id,double slry,double bns)
	{
		super(n,id,slry,bns);
		member_list=new LinkedList<TeamMember>();
	}
	
	//variables
	private LinkedList<TeamMember> member_list;
	
	
	//methods
	
	public  LinkedList<TeamMember> get_member_list()
	{
		return member_list;
	}
	
	public void add_member(TeamMember t)
	{
		member_list.add(t);
	}
	
	
	@Override
	public double calc_bonus()
	{
		double new_bns=0;
		new_bns+=(this.get_task_list().size()*(this.get_salary()/10));
		double factor=this.get_salary()/this.member_list.size();
		
		
		
		for(int i=0;i<this.member_list.size();i++)
		{
			this.member_list.get(i).calc_bonus();
			if(this.member_list.get(i).get_salary()<=this.member_list.get(i).get_bonus())
			{
				new_bns+=factor;
			}
		}
		this.set_bonus(new_bns);
		return new_bns;
		

	}
}
