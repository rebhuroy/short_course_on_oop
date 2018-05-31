class Parent{
	
	
	void s(){
		
		System.out.println("Hello past");
		
	}
	void different(){
		System.out.println("Its different");
		
		
	}
}
class Child1 extends Parent{
	void s(){
		
		System.out.println("Hello present1");
		
	}
	
	
}

class Child2 extends Parent{
	void s(){
		
		System.out.println("Hello present2");
		
	}
	
	
}

class Main_contain{
	
	public static void main(String arg[]){
/*	Parent obj=new Parent();
	obj.s();
	child obj1=new Parent();*///not possible parent cant converted into child type
	
	/*Parent obj=new child();*/
	Child2 obj=new Child2();
	obj.s();
	obj.different();
	
	Child1 obj1=new Child1();
	obj1.different();
	
	}
	
}