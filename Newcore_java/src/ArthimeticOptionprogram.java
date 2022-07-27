import java.util.Scanner;

public class ArthimeticOptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t arthimetic option");
	    System.out.println("\n\n1.Addition\n2.subtractin\n3.multiplication\n4.division\n5.modulus\n6.exit");
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the option to be performed:");
	    int opt=s.nextInt();
	    while(true)
	    {
	    
	    switch(opt)
	    {
	    
	    case 1:
	    
	       System.out.println("addition operation");
	       System.out.println("enter values");
	       int a= s.nextInt();
	       int b=s.nextInt();
	       int sum=a+b;
	       System.out.println("addition of two numbers:"+sum);
	       break;
	    
	    case 2:
	       System.out.println("subtraction operation");
	       System.out.println("enter values");
	        a= s.nextInt();
	        b=s.nextInt();
	        sum=a-b;
	       System.out.println("subtraction of two numbers:"+sum);
	       break;
	    
	    case 3:
	       System.out.println("multiplication operation");
	       System.out.println("enter values");
	        a= s.nextInt();
	       b=s.nextInt();
	        sum=a*b;
	       System.out.println("multiplication of two numbers:"+sum);
	       break;
	    
	    case 4:
	       System.out.println("division operation");
	       System.out.println("enter values");
	        a= s.nextInt();
	        b=s.nextInt();
	          if(a==0||b==0)
	          {
	        	  System.out.println("can't divide with zero");
	          }
	          else {
	        sum=a/b;
	       System.out.println("division of two numbers:"+sum);
	          }
	       break;
	    
	    case 5:
	       System.out.println("modulus operation");
	       System.out.println("enter values");
	        a= s.nextInt();
	        b=s.nextInt();
	        sum=a%b;
	       System.out.println("modulus of two numbers:"+sum);
	       break;
	    	default:
	    		System.out.println("invalid option");
	    		break;
	       }
		  }
		 }
	}


