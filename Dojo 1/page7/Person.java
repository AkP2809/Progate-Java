public class Person {
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
  
  public static void BMI(double h , double w) {
    double bmi = w / (h*h);
    
    System.out.println("My BMI is" + bmi);
  }
}