import java.util.Scanner;

public class ReverseProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number : ");
		int num = s.nextInt();
		int reverse = 0;
		int len = String.valueOf(num).length();
		System.out.println("length "+len);
		for(int i=0;i<len;i++)
		{
			int reminder = num % 10;
			reverse =reverse*10+reminder;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
