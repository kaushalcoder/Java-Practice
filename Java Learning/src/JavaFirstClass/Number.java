package JavaFirstClass;

public class Number {
	
	int num;
	public Number()
	{
		
	}
	public Number(int num)
	{
		this.num=num;
	}
	
	public int getNumber() {
		return num;
	}
	public long factorial()
	{
		long f=1;
		for(int i=1;i<=num;i++)
			f=f*i;
		return f;
	}
	public int square() {
		return num*num;
	}
	public void setNumber(int num) {
		// TODO Auto-generated method stub
		this.num=num;
	}
	

}
