package ClassWork2;

public class TeamMember extends Employee{
	
	public TeamMember()
	{
		super();
		
	}
	
	public TeamMember(String n,long id,double slry,double bns)
	{
		super(n,id,slry,bns);
	}
	
	
	
	@Override
	public double calc_bonus()
	{
		double factor=this.get_salary()/(this.get_task_list().size());
		this.set_bonus(0);
		double new_bns=0;
		for(int i=0;i<this.get_task_list().size();i++)
		{
			switch(this.get_task_list().get(i).check_time())
			{
				case 1:
				{
					break;
				}
				
				case -1:
				{
					new_bns+=factor*2;
					break;
				}
				
				case 0:
				{
					new_bns+=factor;
					break;
				}
			
			}
		}
		this.set_bonus(new_bns);
		return new_bns;
	}
	
}
