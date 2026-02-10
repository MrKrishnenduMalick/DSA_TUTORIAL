package functions;

import java.util.*;

public class Strings {
  public static void main(String[] args) {
    // String person = mygreet();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = in.next();
    String person = mygreet(name);
    System.out.println(person);
  }
  static String mygreet(String name){
  String message = "Heelo" + name;
  return message;
}
  }



