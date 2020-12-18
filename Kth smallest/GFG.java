/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int testcase=sc.nextInt();
	  for  (int i=0;i<testcase;i++)
	  {
		    int size=sc.nextInt();
		    sc.nextLine();
		    String s=sc.nextLine();
		    int k=sc.nextInt();
		    //System.out.println(s);
		   String[] ar=s.trim().split(" ");
		  // System.out.println(ar);
		    int[] arr=new int[ar.length];
		    for(int j=0;j<arr.length;j++)
		   {
		        arr[j]=Integer.parseInt(ar[j]);
		        //System.out.println(arr[j]);
		   }
		   sort(arr,k);
	  }
		     
	} 
		    
	 private static void sort(int[] arr,int k)
	{
		    int size=arr.length;
		    //int min;
		    for(int i=0;i<size;i++)
		   {
		     int min=i;
		     for(int j=i+1;j<size;j++)
		     {
		           if(arr[j]<arr[min])
		             {
		                 min=j;
		             }
		     }
		    int temp = arr[min];
		    arr[min]=arr[i];
		    arr[i]=temp;
		    
  		   }
// for (int i = 0 ;i< size; i++){
//           System.out.print(" "+arr[i]);
//       }
		    System.out.println(arr[k-1]);
		    
	}
		    
}	    
		    
		    
		    
		    
	
	
