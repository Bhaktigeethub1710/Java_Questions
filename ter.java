import java.util.Scanner;
class ter
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		System.out.println("Enter the number");
		num=sc.nextInt();
		str = (num>0) ? "Positive" : "Negative";
		System.out.println("Number is " +str);
	}
}