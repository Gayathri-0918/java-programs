package newDemo;
import java.util.Scanner;

public class Switchpro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
	    int a=sc.nextInt();
	    System.out.println("Enter the value of b");
	    int b=sc.nextInt();
	    System.out.println("Enter the case no");
		int csnum=sc.nextInt();
		switch(csnum)
		{
		case 1:
		    int sum=a+b;
		    System.out.println("Addition="+sum);
		break;
		case 2:
			int sub=a-b;
			System.out.println("subtraction="+sub);
			break;
		case 3:
			int multi=a*b;
			System.out.println("multiplication="+multi);
			break;
		case 4:
			int div=a/b;
			System.out.println("Divison="+div);
			break;
	   default:
	   System.out.println("please enter valid case no");
	   
		
		}

	}

}
