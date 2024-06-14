package Operators;

public class Operator {
	public static void main(String[] args) {
		
		//Arithmetic operation
		//+,-,*,/, %
		
		int a = 100, b = 20;

		System.out.println(10 + 10);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println();
		//Relational operator
		//< >,<= >=, == !=
		
		System.out.println(100<20);//false
		System.out.println(100>20);//true
		System.out.println(100<=20);//false
		System.out.println(100>=20);//true
		System.out.println(100==20);//false
		System.out.println(100==100);//true
		System.out.println(100!=20);//true
		System.out.println(100!=100);//false
		
		System.out.println();

		//logical operator
//		&& || and !
		
		System.out.println(10>20 && 10<20);//false
		System.out.println(10!=20 && 10<20);//true
		System.out.println(!(10>20));
		System.out.println();
		
		//unary operator  increment / decrement 
		
		//prefix ++ increse by 1 -- decrease by 1
		
		int x=5;
		System.out.println(x++);
		System.out.println("print x value :- "+ x);
		System.out.println();
		
		System.out.println(x--);
		System.out.println("print value of x after decrement :- "+ x);
		
		//postfix 
		int y=5;
		System.out.println(++y);
		
		System.out.println(--y);
		
		System.out.println();
		
		//turnary operator
		
		//syntax:- (condition)?expression1:expression2
		
//		here if condition 1 is true then it will print m value else condition n is true then print value of n
		
		int m=10,n=20;
		
		int result=(m>n)?m:n;
		
		System.out.println(result);
		
	}
}
