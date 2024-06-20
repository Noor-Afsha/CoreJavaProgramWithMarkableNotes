package string;

public class ImmutableString {

	public static void main(String[] args) {
		
	String s1="aadi";
	String	s2="noor";
	String s3="aadi";
	System.out.println(s1.equals(s3));//it will check the contents
	System.out.println(s1==s2);//it will check the memory address
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	}
}
