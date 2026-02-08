package firstjavaprogram;
import java.util.Scanner;

public class int_input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rollno = input.nextInt();
    System.out.println("Your roll number is "+ rollno);

    Scanner name = new Scanner(System.in);
    String myname = name.next();
    System.out.println(myname);
  }
}
