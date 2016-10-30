/*
program to merge two arrays in asscending order
*/


import java.util.*;
import java.lang.*;
import java.io.*;


public class MergeArrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={1,2,3,4,5};
		int[] b={5,6,7,8,9};
		int[] c=new int[10];
		
		c=merge(a,b);
		for(int i=0;i<c.length;i++)
		System.out.print(c[i]);
	}
	static int[] merge(int[] a, int[] b)
	{
		
		int firtstArrayLength=a.length, secondArrayLength=b.length;
		int i=0,j=0,k=0;
		int[] result=new int[firtstArrayLength + secondArrayLength];
		
		while (i < firtstArrayLength && j < secondArrayLength)
	    {
	        if (a[i] <= b[j])
	        {
	            result[k] = a[i];
	            i++;
	        }
	        else
	        {
	            result[k] = b[j];
	            j++;
	        }
	        k++;
	    }
	 
	    
	    while (i < firtstArrayLength)
	    {
	        result[k] = a[i];
	        i++;
	        k++;
	    }
	 
	   
	    while (j < secondArrayLength)
	    {
	        result[k] = b[j];
	        j++;
	        k++;
	    }
	    return result;
	}
}