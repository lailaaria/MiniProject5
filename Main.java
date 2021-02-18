import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your current job title?");
    String jobtitle = scan.next();
    System.out.println("What is your current salary? (do not include commas)");
    int salary = scan.nextInt();

    Employee s1 = new Employee(name, jobtitle, salary);

    s1.payRaise();
  }

  public static int Employee(String employeeName, String jobPosition, int yearlyIntake)

 public static int payRaise(){
   if(salary < 100000)
   {
     return salary + 1000;
     System.out.println("Yay! You qualify for a raise, " + name);
   }else{
     return 100000;
   }
 }
}