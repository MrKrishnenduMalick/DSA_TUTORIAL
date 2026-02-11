package practice;
import java.util.Scanner;

public class reverse {
  public static void main(String[] args){
        int rev = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num != 0){
        int rem = num % 10;
        rev = rev * 10 + rem;
         num = num/10;
        }

        System.out.println(rev);
    }
}

