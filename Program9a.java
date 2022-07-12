package inputstaments;

import java.util.Scanner;

public class Program9a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter area of square");
	    int a=sc.nextInt();
	    System.out.println("Enter lenth of rectangle");
	    int l=sc.nextInt();
	    System.out.println("Enter breath of rectangle");
	    int b=sc.nextInt();
	    int s=a*a;
		int r=l*b;
		{
			System.out.println("Area of square="+s);
			System.out.println("Area of rectangle="+r);
		}


	}

}
