import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum+=i;	
		}
		System.out.println("Sum of Digits : "+sum);

	}

}
