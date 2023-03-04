package JavaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Revresenumber {
	
	@Test
	//Factorial
	public void factorialProgram() {
		
		int Fact=1;
		int num=6;
		for(int i=1;i<=num;i++) {
			Fact=Fact*i;
		}
			
		System.out.println("Factorial value is:"+Fact);
		
	}
	
	//Revrese Number
	
	
	@Test
	//palendirom
	public void revrseNum() {
		int Num=123321;
		
		int rev=0;
		int f=Num;
		while(Num>0) {
		int	remind=Num%10;
		rev=rev*10+remind;
		Num=Num/10;
			}
		if(f==rev) {
			System.out.println("num is pallendirom : "+rev);
		}else {
			System.out.println("num is not a pallendirom"+rev);
		}
		
	}
	
	@Test
	
	//Pattern
	
	public void rightpattern() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.println("*");
			}
		}System.out.println();
	}
	
	@Test
	
	//ReverseString
	
	public void revstring() {
		
		String name="AmitBhati1234";
		String b="";
		for(int i=name.length()-1;i>=0;i--) {
			
			b=b+name.charAt(i);
				
			
		}
		System.out.println("revstring are :"+b);
		
	}
	
	@Test
	//odd or even number
	
	
	public void numbers() {
		int num=100;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				
				System.out.println(i+"-->even number");
			}else {
				System.out.println(i+"-->odd number");
				
			}
		}
		}
	
	@Test
	
	//fabonacci series
	
	public void fab() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<10;i++) {
			int c=a+b;
			System.out.println(c+"fabonacci series--->");
			a=b;
			b=c;
		}
		
}
	@Test
	
	//swapnumber
	public void swpnumber() {
		Scanner sb=new Scanner(System.in);
		int a=sb.nextInt();
		int b=sb.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("val of a:"+a+"val of b:"+b);
	
		
	}
	
	@Test
	
	//reverse string
	
	public void testrevrse()
	{
	String st="amit123";
		
		String b=" ";
		for(int i=st.lenght()-1;i>=0;i--){
			    b=b+st.charAT(i);
		}
		System.out.println("revrsevalue :"+b);
			
	}	
		
		
		
}
