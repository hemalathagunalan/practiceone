package testingprojectjunit;

import utility.Actionclass;

public class dashboardobject extends Actionclass {

	

	public static void main(String args[])
	{
	dashboardobject db=new dashboardobject();
	db.printvalue();
	
}
	public void printvalue()
	{
		
	Object boo = null;
	try {
		String name = null;
		int obt = 0;
		boo=click(name,obt);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(boo);
		
	}
}
