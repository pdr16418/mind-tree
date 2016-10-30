/* package whatever; // don't place package name! */

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			a=a+i-1;
			if(i!=1&& i%2!=0)
			a=a+i;
			
		
			for(int j=1;j<=i+i-1;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					
					
						
					if(i%2==0)
					{  
					
						
						System.out.print(a);
						a--;
						
						
					
					}
					else
					
					{
						
						System.out.print(a);
						a++;
					
					
					}
					
				}
				
				
			}
			System.out.println("");
			
		}
	}
}