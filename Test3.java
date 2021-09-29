import java.lang.reflect.*;

class Test3{
	public static void main(String[] args){
		System.out.println(String.class.getClassLoader());
		System.out.println(Test3.class.getClassLoader());
		System.out.println(Customer.class.getClassLoader());
	}
}