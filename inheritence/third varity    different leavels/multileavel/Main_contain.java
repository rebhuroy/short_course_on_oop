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

class Child_of_child extends child{
	void s(){
		
		System.out.println("Hello present to the next");
		
	}
	
	
}

class Main_contain{
	
	public static void main(String arg[]){
/*	Parent obj=new Parent();
	obj.s();
	child obj1=new Parent();*///not possible parent cant converted into child type
	
	/*Parent obj=new child();*/
	Child_of_child obj=new Child_of_child();
	obj.s();
	}
	
}