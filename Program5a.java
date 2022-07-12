package inputstaments;
import java.util.Scanner;
public class Program5a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of a");
	    int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("the number is positive");
		}
        else
		{
			System.out.println("the number is negative");
		}

	}

}
