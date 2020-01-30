package ExtendClass;

public class ClassNum2 extends ClassNum1 {
      int c;
	public ClassNum2(int x, int y, int z) {
		super(x, y);
		c=z;
		}
	public int g2()
	{
		return super.g2()>c?super.g2():c;
	}
	public int p2()
	{
		return super.p2()*c;
	}

}
