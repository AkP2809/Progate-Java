import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("First Name: ");
    String firstName = sc.next();
    
    System.out.print("Last Name: ");
    String lastName = sc.next();
    
    System.out.print("Age: ");
    int age = sc.nextInt();
    
    System.out.println("My name is " + firstName + " " + lastName + ".");
    System.out.println("I am " + age + " years old. ");
    if(age >= 18) {
      System.out.print("I am an adult.");
    }
    else {
      System.out.print("I am not an adult.");
    }
    
  }
}
