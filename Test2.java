class Test2{
	public static void main(String[] args){
		
		Student s1=new Student();
		Class c1=s1.getClass();
		System.out.println(c1.hashCode());
		
		Student s2=new Student();
		Class c2=s2.getClass();
		System.out.println(c2.hashCode());
		
		System.out.println(c1==c2);
	}
	
}

//BootStrap classLoader is responsible for loading rt.jar (JDK\JRE\Lib\rt.jar this location is called bootstrap classpath).
//BootStrap classLoader is responsibe to load core java API classes and that classes present in rt.jar

