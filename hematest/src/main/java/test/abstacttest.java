package test;

public abstract class abstacttest {
	protected int testdata=1000;
	abstacttest(int len, float h){
	System.out.println(len * h * testdata);
				}
	
	abstract void draw();
	
}

class circle extends abstacttest {
	circle(int a, float b)
	{
		super(a , b);
	}
	
	void draw()
	{
	System.out.println("hi");
		
	}
}
	class rectange extends abstacttest
	{
		rectange(int c, float d)
		{super(c,d);}
		void draw() {
			System.out.println("this implement all for git repository");
			
		};



public static void main(String[] args)
{
circle cir=new circle(100, (float) 50.00);
cir.draw();
rectange rec=new rectange(50, (float)76.00);
rec.draw();
b bec =new b();
bec.draw();
}
}
	
	