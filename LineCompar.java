import java.util.Scanner;
public class LineCompar 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		int x1, x2, y1, y2, x3, x4, y3, y4;
		double lengthOfLine1, lengthOfLine2;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the point x1: ");
		x1 = in.nextInt();
		System.out.println("enter the point x2: ");
		x2 = in.nextInt();
		System.out.println("enter the point y1: ");
		y1 = in.nextInt();
		System.out.println("enter the point y2: ");
		y2 = in.nextInt();
		System.out.println("enter the point x3: ");
		x3 = in.nextInt();
		System.out.println("enter the point x4: ");
		x4 = in.nextInt();
		System.out.println("enter the point y3: ");
		y3 = in.nextInt();
		System.out.println("enter the point y4: ");
		y4 = in.nextInt();
		lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		lengthOfLine2 = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
		System.out.println("Length of the line1: " + lengthOfLine1);
		System.out.println("Length of the line2: " + lengthOfLine2);
		Double s1 = lengthOfLine1;
		Double s2 = lengthOfLine2;
		int compare = s1.compareTo(s2);
		if (s1 == s2) 
		{
		System.out.println("Both Lines are Equal");
		} else if (s2 > s1) 
		{
			System.out.println("Line2 is greater than line1");
		} else 
		{
			System.out.println("Line1 is greater than line2");
		}
		}
}