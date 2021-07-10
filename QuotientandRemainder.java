import java.util.*;
import java.lang.String;
public class QuotientandRemainder {

	public static void main(String[] args) {
		System.out.println("Enter the Divident value");
		Scanner sc=new Scanner(System.in);
		int Divident= sc.nextInt();
		System.out.println("Enter the diviser value");
		int diviser=sc.nextInt();
		int quotient=Divident/diviser;
		int reminder=Divident%diviser;
System.out.println("Quotient= " +quotient);
System.out.println("Reminder= "+reminder);
	}

}
