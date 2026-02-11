package array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    list.add(67);
    list.add(676);
    list.add(675);
    list.add(674);
    list.add(679);
    list.add(678);
    list.add(671);

    System.out.println(list.contains(67));

    list.set(0,99);
    list.remove(2);

    for(int i = 0; i < 5; i ++){
      list.add(in.nextInt());
    }
    for(int i = 0; i < 5; i ++){
      System.out.println(list.get(i));// pass index here
    }
    System.out.println(list);



    System.out.println(list);
  }
}
