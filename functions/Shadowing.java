package functions;

public class Shadowing {
   static int x = 90;  //this will be shadowed
  public static void main(String[] args) {

    
  }
  static void fun(){
      System.out.println(x);
    }
}
