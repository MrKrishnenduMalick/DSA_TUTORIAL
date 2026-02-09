package conditionals_loops;

public class Main {
  public static void main(String[] args) {
    int salary = 25400;
    if(salary > 10000)
    {
      salary = salary + 1500;
    }else if (salary >5000) {
        salary = salary + 1000;
    }
    else{
      salary = salary + 500;
    }
    System.out.println(salary);
  }
}
