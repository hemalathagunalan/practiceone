package test;

interface interfacetest {
	int i=500;
	void draw();	
}
class b implements interfacetest 
{
	public void draw()
	{
		System.out.println("draw"+ i);
		}
	
}
