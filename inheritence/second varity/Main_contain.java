class Parent{
	
	
	void s(){
		
		System.out.println("Hello past");
		
	}
}
class child extends Parent{
	void s(){
		
		System.out.println("Hello present");
		
	}
	
	
}

class Main_contain{
	
	public static void main(String arg[]){
/*	Parent obj=new Parent();
	obj.s();
	child obj1=new Parent();*///not possible parent cant converted into child type
	
	Parent obj=new child();
	obj.s();
	}
	
}