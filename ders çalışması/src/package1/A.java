package package1;
import package2.*;


public class A {

	public static void main(String[]args) {
		B b = new B();
		Asub asub=new Asub("sa",1);
		
		System.out.println(b.privateMessage);
	
	System.out.println(asub.getEx2());}
}
