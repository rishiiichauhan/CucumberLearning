package javamethod;

public class Test2 {

	public static void main(String[] args) {
	
		
		Test obj = new Test();
		
		String userName= obj.email();
		obj.email();
		System.out.println(userName);

	}

}
public static void differentvalues(int number, String name, float marks, long phone, String email) {

	System.out.println(number);
	System.out.println(marks);
	System.out.println(phone);
	System.out.println(email);
