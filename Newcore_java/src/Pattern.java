import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
         /*System.out.println("Enter the number : ");
         int n = scan.nextInt();
         for(int i =0;i<=n;i++)
           {
             for(int j=n;j>=i;j--)
	          {
		       System.out.print("*");
	          }
             System.out.print("\n");
              }
	        }
	      }*/

//right angle triangle

System.out.println("Enter the number : ");
int n = scan.nextInt();
for(int i=0;i<=n;i++)//row
  {
   for(int j=0;j<=i;j++)//column 
     {
       System.out.print("*");
     }
   System.out.print("\n");
   }
	}
     }


