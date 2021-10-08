import java.util.Scanner;
public class LineCompar 
{
	double lengthOfFirstLine, lengthOfSecondLine;
	    public static void main(String[] args) {
	        System.out.println("Welcome to Line Computation program by class method");
	        LineCompar linecmp = new LineCompar();
	        linecmp.lengthOfLine1();
	        linecmp.lengthOfLine2();
	        linecmp.equalTo();
	        linecmp.compareTo();
	    }
		public double lengthOfLine1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("enter the point x1: ");
			int x1 = in.nextInt();
			System.out.println("enter the point x2: ");
			int x2 = in.nextInt();
			System.out.println("enter the point y1: ");
			int y1 = in.nextInt();
			System.out.println("enter the point y2: ");
			int y2 = in.nextInt();
			lengthOfFirstLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			System.out.println("Length of the line1: " + lengthOfFirstLine);
			return lengthOfFirstLine;
		}
		
		public double lengthOfLine2()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("enter the point x3: ");
			int x3 = in.nextInt();
			System.out.println("enter the point x4: ");
			int x4 = in.nextInt();
			System.out.println("enter the point y3: ");
			int y3 = in.nextInt();
			System.out.println("enter the point y4: ");
			int y4 = in.nextInt();
			lengthOfSecondLine = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
			System.out.println("Length of the line2: " + lengthOfSecondLine);
			return lengthOfSecondLine;
		}

	    public void equalTo() {

	        if(lengthOfFirstLine == lengthOfSecondLine)
	        {
	            System.out.println("Lines are Equal");
	        }
	        else
	        {
	            System.out.println("lines are not equal");
	        }
	    }
	    
	    public void compareTo() {
	        if (lengthOfFirstLine > lengthOfSecondLine) 
	        {
	            System.out.println("Line1 is greater than line2");
	        } 
	        else if (lengthOfFirstLine < lengthOfSecondLine) {
	            System.out.println("Line2 is greater than line1");
	        } 
	        else 
	        {
	            System.out.println("Both Lines are Equal");
	        }
	    }
	
}