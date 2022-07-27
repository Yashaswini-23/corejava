import java.util.Scanner;

public class FactorialProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the num:");
       int i=1,fact=1;
       int n=s.nextInt();
       
      /* for(i=1;i<=n;i++)
         {
    	   fact=fact*i;
         }*/
       
       while(i<=n)
         {
    	   fact=fact*i;
    	   i++;
         }
       System.out.println("factorial:"+fact);
	}

}
