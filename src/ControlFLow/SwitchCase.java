package ControlFLow;

public class SwitchCase {

	//what is switch case?
	//if Experession and value does not match then print default value.
	//expression can be anything but result should be constant.
	
	
	public static void main(String[] args) {
		//with initialization
		int a=2;
		switch(a)
		{
		case 1:System.out.println("print hi");
		break;
		case 2: System.out.println("print hello");
		break;
		case 3:System.out.println("print welcome");
		break;
		case 4:System.out.println("print good bye");
		break;
		default :System.out.println("never come to my life.");
		}
		
		//with character
		
		char c='b';
		
		switch(c) {
		
		case 'd':System.out.println("good morning");
		break;
		
		case 'e': System.out.println("good after noon");
		break;
		
		default :System.out.println("No answer");
		
		}
		
		switch(10/5+2) {
		
		case 2:System.out.println("print value of add");
		break;
		
		case 4:System.out.println("print value of quotation");
		break;
		
		default: System.out.println("here expression can be anything but value should be constant");
		}

	}
	
	
	}
