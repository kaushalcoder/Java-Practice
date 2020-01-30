package DefineArea;

public class CalculateArea {
	int side;
	int radius;
	final float pi=3.14f;
	public CalculateArea(int s, int r)
	{
		this.radius=s;
		this.side=r;
	}
	public void area(int s)
	{
		int asquare = s*s;
		System.out.println("Area of Circle is:"+asquare);
	}
	public void area(int s, int r)
	{
		float acircle = pi*r*r;
		System.out.println("Area of Circle is:"+acircle);
	}
}
