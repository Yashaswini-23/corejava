import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the multiplication number : ");
		int num = s.nextInt();
		System.out.println("Enter the numbers  : ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));		
		}
		
	}

}
