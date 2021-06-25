package com.bridgelabz.utility;
import java.util.Scanner;
public class Swap {
      Scanner scanner;
      public Swap()
      {
    	  scanner = new Scanner(System.in);
      }
      public int getIntvalue()
      {
    	  return scanner.nextInt();
      }
      public void swap(int a, int b)
      {
    	  a = a + b;
    	  b = a - b;
    	  a = a - b;
    	  System.out.println("Without using Third Variable");
    	  System.out.println(a + "This After swaping");
    	  System.out.println(b + "This is After Swaping");
      }
      public void withvar(int a , int b) {
    	  int c = a;
    	  a = b;
    	  b = c;
    	  System.out.println("This is With Third Variable");
    	  System.out.println(a + "This After swaping");
    	  System.out.println(b + "This is After Swaping");
      }
}
