package year;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
	   int n;
	   Scanner y= new Scanner(System.in);
	   System.out.println("Enter an year: ");
	   n= y.nextInt();
		
		if((n % 4 == 0 && n % 100 != 0)||(n % 400== 0)) {
        System.out.println("this is a leap year " +n);
		}
        else {
        System.out.println("this is an ordinary year");
        
	    }
	}
}
