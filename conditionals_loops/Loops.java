package conditionals_loops;

import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Q. Print number 1 to 10
    /*
      Syntax of for loops:

      for (intialisation; condition;increment/decrement){
        // body
      }
    */
    for(int num = 1; num <= 5; num += 1)
    {
      System.out.println(num);
    }
    //Print numbers from 1 to n

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i =1 ;i<=n ; i++)
    {
      System.out.println(i);
    }

    /*
      While Loops
    Syntax:
      while(condition){
        body 
      }
    */  

      int num = 1;
      while(num <= 5)
      {
        System.out.println(num);
        num++;
      }

      /*
      do while
      do{

      }while (condition);
      */ 

      int n = 1;
      
      do{
        System.out.println(n);
        n++;

      }while(n !=1);
  }
}
