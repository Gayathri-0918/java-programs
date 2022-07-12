package newDemo;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your average marks");
    int a=sc.nextInt();
    if(a>=95)
    {
    	System.out.println("you are distinction");
    }
    else if(a>=90)
    {
    System.out.println("your grade is A");	
    
    }
    else if(a>=80)
    {
    	System.out.println("your grade is B");
    }
    else if(a>=70)
    {
    	System.out.println("your grade is C");
    }
    else if(a>=60)
    {
    	System.out.println("your grade is D");
    }
    else if (a>=40)
    {
    	System.out.println("your grade is E");
    }
    else if(a<=35)
    {
    	System.out.println("your are fail");
    }
    
	}

}
