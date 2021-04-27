import java.util.Scanner;

public class prime {

	
static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	
	
	System.out.println("enter no");
	    int  n=sc.nextInt();
	       int i;
		   int flag=0;
		
		for(i=2;i<n;i++)      //i=n/2
		{
			if(n%i==0)       //n%2==0
			{
				flag=1;
				System.out.println("no is  not prime");	
				break;
				
			}
			if(flag==0)
			{
			
				System.out.println("no is prime");
				break;
			}
			
		}

	}
}


