public class Letter
{
	private String tName;
	private Address tAddress;
	private String fName;
	private Address fAddress;
	private double weight; //in ounces
	
	public Letter(String tName, Address tAddress, 
	String fName, Address fAddress, Double weight)
	{
		this.tName = tName;
		this.fName = fName;
		this.fAddress = fAddress;
		this.tAddress = tAddress;
		this.weight = weight;
	}
	
	public String getTname(String tName)
	{
		return tName;
	}
	
	public void setTname(String tName)
	{
		this.tName = tName;
	}
	
	public String getFname(String fName)
	{
		return fName;
	}
	
	public void setFname(String fName)
	{
		this.fName = fName;
	}
	
	public double getWeight(double weight)
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/*
	Created a formula to determine the postage any given letter
	depending on the ounce. The ratio is .46 cents per ounce.  
	*/
	public static double getPostage(double weight)
	{
		double postage = .46;
		double ounce;
		postage = weight * postage;
		return postage;
	}
	
	public int compareTo(Letter that)
	{
		int value;
		value = this.addrTo.getZip().compareTo(that.addrTo.getZip());
		
	}
	public String toString()
	{
		return "--------------------------------------------" + "\n" +
			   "-------------" + "\n" + 
			   "From: " + this.fName + "\n" + 
			   this.tAddress.toString() + "\t\t\t"+ "Postage" + getPostage();
	}
}