package inputstaments;
import java.util.Scanner;
public class Program4a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of a");
	    int a=sc.nextInt();
	    System.out.println("Enter the value of b");
	    int b=sc.nextInt();
	    int c=a;
		a=b;
		b=c;
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
		}

	}

}
