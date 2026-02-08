package firstjavaprogram;

import java.util.Scanner;

public class typecasting {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float num = input.nextFloat();
    System.out.println(num);


    // TypeCasting
    int Num = (int)(67.97f);
    System.out.println(Num);
  }
}
