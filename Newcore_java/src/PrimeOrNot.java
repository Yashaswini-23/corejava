import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter A Number"); 
        int num =s.nextInt(); 
        int b=1; 
        int c=0; 
         while(b<= num) 
            { 
                if((num%b)==0) 
                   c=c+1; 
                   b++; 
            } 
             if(c==2) 
             System.out.println(num +" is a prime number"); 
             else 
             System.out.println(num +" is not a prime number"); 
   } 
} 
		 



