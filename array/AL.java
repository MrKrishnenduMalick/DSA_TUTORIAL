package array;
import java.util.ArrayList;
import java.util.Collections;

public class AL{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<String> list1 = new ArrayList<String>();

    // add elements

    list.add(0);
    System.out.println(list);
    int element = list.get(0);

    // add elements in between 

    list .add(1,1);
    System.out.println(list);

    // set element
    list.set(0,5);
    System.out.println(list);

    //  delete element

    list.remove(3);

    //  size
    int size = list.size();

    // loops

    for(int i = 0; i < list.size(); i++){
      System.out.println(i);
    }
    System.out.println();

    Collections.sort(list);
  }
}