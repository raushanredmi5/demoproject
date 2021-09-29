import java.lang.reflect.*;

class Student{
	public String getName(){
		return "raushan";
	}
	
	public int getRollNo(){
		return 10;
	}
	
	public boolean methodRight(){
		return true;
	}
}


class Test{
	public static void main(String[] args) throws Exception{
		int count=0;
		Class c=Class.forName("java.lang.String");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The no. of Methods:" +count);
	}
}
		
			

