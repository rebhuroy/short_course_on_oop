class A{
	
	 private int i;
	public void setI(int j)//seeter methode
	{
		i=j;
	}
	public int getI()//getter methode
	{
		return i;
	}
	
}
class MainClass{
public static void main(String args[])
                {
	A obj=new A();
	obj.setI(55);
	System.out.println(obj.getI());
                 }
	
}