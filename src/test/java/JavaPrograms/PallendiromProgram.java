package JavaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PallendiromProgram {
	
	//this is pallendirom program
	
	@Test
	
	public void Pallendiromprogrm() {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int rev=0;
		int f=num;
		
		while(num>0) {
			
			
			int remind=num%10;
			
			rev=rev*10+remind;
			num=num/10;
			
		}if(f==rev) {
			
			System.out.println("number is pallendirom"+rev);
		}else {
			
			System.out.println("number is not pallendirom"+rev);
			
		}
		
	}

}
