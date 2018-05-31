class Parent{
	
	
	void s(){
		
		System.out.println("Hello past");
		
	}
}
class child{
	void s(){
		
		System.out.println("Hello present");
		
	}
	
	
}

class Main_contain{
	
	public static void main(String arg[]){
	Parent obj=new Parent();
	obj.s();
	child obj1=new child();
	obj1.s();
	}
	
}