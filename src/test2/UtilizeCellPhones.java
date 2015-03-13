package test2;
import java.util.Scanner; 

class CellPhone {

	private String brand;
	private long serial;
	private double price;
	
	public CellPhone()
	{
		brand = "apple";
		serial = 00000000;
		price  = 500.00;
	}
	
	
	public CellPhone(String x, long y, double z)
	{
		brand = x;
		serial = y;
		price  = z;
	}
	
	public String getbrand()
	{
		return brand;
	}
	
	public long getserial()
	{
		return serial;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public boolean changevalue(int input) 
	{
		Scanner kb = new Scanner(System.in);
	    		
		while(true)
		{
		      switch (input)
		      {
		           case 1:
			            System.out.println("please input the brand you want:");
			            brand = kb.next();
		                break;
		           case 2:
               			System.out.println("please input the serial you want:");
			            serial = kb.nextLong();
               			break;
		           case 3:
			            System.out.println("please input the price you want:");
			            price = kb.nextDouble();
			            break;
		           default:
			            System.out.println("The input is not between 1 - 3");
		      }
		}
			
	}
	
}



public class UtilizeCellPhones
{
	public static void main (String agrs [])
	{
		CellPhone c1 = new CellPhone("nexus 7", 999999999, 500.00);
		CellPhone c2 = new CellPhone("nexus 7", 999999999, 500.00);
		CellPhone c3 = new CellPhone("nexus 7", 999999999, 500.00);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.changevalue(1);
		c2.changevalue(1);
		c2.changevalue(2);
		c3.changevalue(3);
		
		c1.getbrand();
		c2.getbrand();
		c2.getprice();
		c3.getserial();
		
	    c1.equals(c2);
	    c2.equals(c3);
	    c3.equals(c1);
	}
}
