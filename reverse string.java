//Write a Program that will check whether a given String is Palindrome or not
import java.util.Scanner;
public class Main 
{  
   public static void main(String[] args) 
   {  
       Scanner str = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       String r = ""; 
       String num = str.nextLine(); 
       int length = num.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         r = r + num.charAt(i);  
      if (num.equals(r))  
         System.out.println("The entered string " +num +" is a palindrome.");  
      else  
         System.out.println("The entered string " +num +"  isn't a palindrome.");     
  }
} 