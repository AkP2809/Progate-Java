import java.util.Scanner;

class Main {
  public static String fullName(String fName , String lName) {
    return (fName + " " + lName);
  }
  
  public static void printData(String name, int age , double h , double w) {
    System.out.println("My name is " + name + ".");
    System.out.println("I am " + age + " years old. ");
    
    if(age >= 18)
      System.out.println("I am an adult.");
    else 
      System.out.println("I am not an adult.");
      
    System.out.println("I am " + h + "m tall.");
    System.out.println("I weigh " + w +"kg.");
  }
  
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
    
    String name = fullName(firstName , lastName);
    printData(name , age , height , weight);
    
  }
}
