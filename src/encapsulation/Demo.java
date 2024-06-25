package encapsulation;

public class Demo {
	
	public static void main(String[] args) {
		Student s=new Student();
		//if we are setting the value then we are getting the value what we are setting
		s.setId(100);
		s.setName("noor");
		s.setAccountNumber(123456);
		
		//if we will not set the value will get default value
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAccountNumber());
	}
}