public class Active
{
	private int hoursLeft,
				hoursRequired,
				hoursDone,
				minutesLeft,
				minutesRequired,
				minutesDone;
	private String name;
	
	//DVC
	public Active()
	{
		this.hoursLeft = 0;
		this.hoursRequired = 0;
		this.hoursDone = 0;
		this.minutesLeft = 0;
		this.minutesRequired = 0;
		this.minutesDone = 0;
		this.name = "default active";
	}
	
	//EVC
	public Active(int hL, int hR, int hD, int mL, int mR, int mD, String n)
	{
		this.hoursLeft = hL;
		this.hoursRequired = hR;
		this.hoursDone = hD;
		this.minutesLeft = mL;
		this.minutesRequired = mR;
		this.minutesDone = mD;
		this.name = n;
	}
	
	//Getters and Setters
	
	public int getHoursLeft(int hoursLeft)
	{
		return hoursLeft;
	}
	
	public void setHoursLeft(int hoursLeft)
	{
		this.hoursLeft = hoursLeft;
	}
	
	public int hoursRequired(int hoursRequired)
	{
		return hoursRequired;
	}
	
	public void setHoursRequired(int hoursRequired)
	{
		this.hoursRequired = hoursRequired;
	}
	
	public int getHoursDone(int hoursDone)
	{
		return hoursDone;
	}
	
	public void setHoursDone(int hoursDone)
	{
		this.hoursDone = hoursDone;
	}
	
	public int getMinutesLeft(int minutesLeft)
	{
		return minutesLeft;
	}
	
	public void setMinutesRequired(int minutesRequired)
	{
		this.minutesRequired = minutesRequired;
	}
	
	public int getMinutesDone(int minutesDone)
	{
		return minutesDone;
	}
	
	public void setMinutesDone(int minutesDone)
	{
		this.minutesDone = minutesDone;
	}
	
	public String getName(String name)
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" +
			   "Hours Required: " + hoursRequired + "\n" + 
			   "Minutes Required: " + minutesRequired + "\n" +
			   "Hours Left: " + hoursLeft + "\n" + 
			   "Minutes Left: " + minutesLeft + "\n" +
			   "Hours Done: " + hoursDone + "\n" + 
			   "Minutes Done: " + minutesDone;
	}
	

}