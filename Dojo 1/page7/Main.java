import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("First Name: ");
    String firstName = sc.next();
    
    System.out.print("Last Name: ");
    String lastName = sc.next();
    
    System.out.print("Age: ");
    int age = sc.nextInt();
    
    System.out.print("Height(m): ");
    double height = sc.nextDouble();
    
    System.out.print("Weight(kg): ");
    double weight = sc.nextDouble();
    
    String name = Person.fullName(firstName , lastName);
    Person.printData(name , age , height , weight);
    Person.BMI(height , weight);
    
  }
}
