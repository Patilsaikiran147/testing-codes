package package1;

import java.util.Scanner;

public class PlndrmStrng 
{

	 public static void main(String args[])
	   {
	     String str="tulasiisalut";
	     String rev=" ";
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 rev=rev+str.charAt(i);
	     }
	     if(rev==str)
	     {
	    	 System.out.println("it is a palindrome");
	     }
	     else
	     {
	    	 System.out.println("It is not a palindrome");
	     }
	   }
	   }




