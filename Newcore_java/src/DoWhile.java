import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
        int i=0,sum=0;
		System.out.println("Enter the number");
		int n = s.nextInt();
		do
		{
			sum+=i;
			i++;
		}
		while(i <= n);
		System.out.println("Sum : "+sum);
	}

}
