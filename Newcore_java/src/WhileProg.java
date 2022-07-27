import java.util.Scanner;

public class WhileProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int i=0,sum=0;
 		System.out.println("Enter the number : ");
 		int n = s.nextInt();
 		while(i <= n)
 		{
 			sum+=i;
 			i++;
 		}
 		System.out.println("Sum : "+sum); 
	}

}
