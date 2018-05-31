abstract class Nokia{
	
	
public void play(){
	
	System.out.println("hello u r in play");
}

public abstract void cook();
public abstract void converse();
//public abstract void dance();


}

abstract class Gionee extends Nokia{
	
	public void cook(){
		
		
	System.out.println("i m cooking");
	}
	
}


class Motorwala extends Gionee{
	
	public void  converse(){
		
		
	System.out.println("i m  converse");
	}
	//public abstract void dance();
}


class Abst{
	
	
	public static void main(String arg[])
	{
		
		Nokia obj = new Motorwala();
		obj.play();
		obj.cook();
		obj.converse();
		
	}
}