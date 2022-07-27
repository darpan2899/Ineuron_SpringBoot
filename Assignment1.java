import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter question number for Assignment 1:");
		int choice = sc.nextInt();
		int n;
		switch(choice)
		{
		case 1:
			System.out.print("Enter the Font Size:");
			n = sc.nextInt();
			System.out.println();
			if(n%2==0) {
				n= n-1;
			}
			System.out.print("Enter your name:");
			String temp = sc.nextLine();
			String name1 = sc.nextLine();
			name1 = name1 + " INEURON";
			String name = name1.toUpperCase();
			String names[] = name.split(" ");
			for(int ns=0; ns<names.length; ns++)
			{
				Assignment1.printChar(names[ns], n);
				System.out.println();
			}
			break;
		case 2:
			System.out.print("Enter the size of row:");
			n = sc.nextInt();
			System.out.print("Enter the size of column:");
			int n1 = sc.nextInt();
			for(int i=0; i<n1; i++)
			{
				System.out.println();
				for(int j=0; j<n; j++)
				{
					System.out.print(i+1 + " ");
				}
			}
			break;
		case 3:
			System.out.print("Enter the size of square:");
			n = sc.nextInt();
			for(int i=0; i<n; i++)
			{
				System.out.println();
				for(int j=0; j<n; j++) {
					if(i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || j-i>=n/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			break;
		case 4:
			System.out.print("Enter the size of square:");
			n = sc.nextInt();
			if(n%2==1) {
				n= n-1;
			}
			for(int i=0; i<n; i++)
			{
				System.out.println();
				for(int j=0; j<n; j++) {
					if(i==n-1 || i-j>=n/2 || i+j>=(3*n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			break;
		case 5:
			System.out.print("Enter the size of square:");
			n = sc.nextInt();
			for(int i=0; i<n; i++)
			{
				System.out.println();
				for(int j=0; j<n; j++) {
					if(i==0 || j==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=n/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			break;
		default:
			System.out.println("Invalid input!\nEnter a valid input.");
			Assignment1.main(args);
			break;
		}
		
	}
	static void chooseExpr(char alphabet,int n,int i, int j)
	{
		switch(alphabet) 
		{
		case 'A': 
					
					if((j==0&&i!=0) || (i==0&&j<=(n-2)/2&&j!=0) || (i==n/2&&j<=(n-2)/2) || (j==(n-1)/2 && i!=0)) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
					
			
			break;
		case 'B':
		
					if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2) || (i==n-1&&j<=(n-2)/2) || (j==(n-1)/2 && i!=0 && i!=n/2 && i!=n-1)) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
					
			
			break;
		case 'C':
					if(j==0 || (i==0&&j<=(n-2)/2) || (i==n-1&&j<=(n-2)/2)) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
					
			break;
		case 'D':
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n-1&&j<=(n-2)/2) || (j==(n-1)/2 && i!=0 && i!=n-1)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
			break;
		case 'E':
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2) || (i==n-1&&j<=(n-2)/2)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
			break;
		case 'F':
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
			break;
		case 'G':
			
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2&&j>=(n-2)/4) || (i==n-1&&j<=(n-2)/2) || (j==(n-1)/2 && i>=(n/2))) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
	
			break;
		case 'H':
			
			if(j==0 || (i==n/2&&j<=(n-2)/2) || j==(n-1)/2) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
	
			break;
		case 'I':
			
			if(i==0 || j==n/2 || i==n-1) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
	
			break;
		case 'J':
			
			if(i==0 || j==n/2 || (i==n-1&&j<=(n-1)/2)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
	
			break;
		case 'K':
			
			if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'L':
			
        	if(j==0 || (i==n-1&&j<n))  
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'M':
			
        	if(j==0 || j==n-1 || (i==j&&i<=(n-1)/2) || (i+j==(n-1)&&i<=(n-1)/2))  
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'N':
			
        	if(j==0 || j==n-1 || i==j)  
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'O':
			
        	if((j==0 || j==n-1 || i==0 || i==n-1)&& i!=j)  
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
		case 'P':
			
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2) || (j==(n-1)/2 && i!=0 && i!=n/2 && i<=(n-1)/2)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'Q':
			
        	if(j==0 || j==n-1 || i==0 || i==n-1 || (i==j&&i>=(n-1)/2))  
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'R':
    		
			if(j==0 || (i==0&&j<=(n-2)/2) || (i==n/2&&j<=(n-2)/2) || (j==(n-1)/2 && i!=0 && i!=n/2)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
	     break;
        case 'S':
    		
			if((j==0 && i<=(n-1)/2) || (i==0&&j<=(n-1)/2) || (i==n/2&&j<=(n-1)/2) || (i==n-1&&j<=(n-1)/2) || (j==(n-1)/2&& i>=(n-1)/2))
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
	     break;
        case 'T':
			
			if(i==0 || j==n/2) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'U':
			
        	if(j==0 || j==n-1 || i==n-1) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'V':
			
        	if(j==0 || i+j==(n-1)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
        case 'W':
			
        	if(j==0 || j==n-1 || (i+j==(n-1)&&i>=(n-1)/2) || (i==j)&&i>=(n-1)/2) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
		case 'X':
			
        	if(i==j|| i+j==(n-1)) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			break;
		case 'Y':
    		
			if((j==0 && i<=(n-1)/2) || (i==n/2&&j<=(n-1)/2) || (i==n-1&&j<=(n-1)/2) || j==(n-1)/2)
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
	     break;
      case 'Z':
    		
			if(i==0 || i==n-1 ||i+j==n-1)
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
	     break;
		}
	}
	static void printChar(String name,int n) 
	{
		for(int i=0; i<n; i++)
		{
			System.out.println();
			for(int k=0; k<name.length(); k++) 
			{
				for(int l=0; l<n; l++)
				{
					System.out.print(" ");
				}
				for(int j=0; j<n; j++)
				{
					Assignment1.chooseExpr(name.charAt(k), n, i, j);
					
				}
				
			}
		}
		
	}
}
