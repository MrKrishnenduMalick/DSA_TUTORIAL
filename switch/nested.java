
import java.util.Scanner;

public class nested {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    int empId = in.nextInt();
    String Dept = in.next();

    switch(empId){
      case 1:
        System.out.println("Krsih Sahe");
        break;
      case 2:
        System.out.println("Krisheli");
        break;
      case 3:
        System.out.println("Emp Number 3");
        switch(Dept){
          case "IT":
            System.out.println("It Department");
            break;
          case "Management":
            System.out.println("Management Department");
            break;
          default:
            System.out.println("No department");
        }
      default:
        System.out.println("enter right empId");
    }
  }
}
