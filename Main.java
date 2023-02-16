import java.util.*;

class Main {
  public static void main(String[] args) {

    //Keyboard scanner for user input 
    Scanner keyboard = new Scanner(System.in);

    //Welcome message
    System.out.println("Welcome to the automated shape calculator!  \nYou will be shortly asked to choose your shape.");

    //Asks user for shape choice
    System.out.println("Please enter your desired shape:\n1 For Circle\n2 For Rectangle\n3 For Triangle\n4 For Trapezoid\n"); 

    int choice = keyboard.nextInt();

    //Code for user choosing circle
    if(choice == 1){

      System.out.println("Please enter your desired circle radius:");

      double radius = keyboard.nextDouble();

      //Instance of circle class
      Circle myCircle = new Circle();

      //Sets the radius
      myCircle.setRadius(radius);

      System.out.println("Please enter your desired 2nd circle radius:");

      double radius2 = keyboard.nextDouble();
      //Sets the radius
      myCircle.setRadius2(radius2);

      //Prints out circle area, radius and circumference through the Circle class
      System.out.println("Your circle radius: " + myCircle.getRadius() + "\nYour circle area: " + myCircle.getArea() + "\nYour circle circumference: " + myCircle.getCircumference());
    //Print if 2 circles are equal
    if(myCircle.isEqual() == true){
      System.out.println("Your circles have equal radius! Their sum area is " + Circle.Sum(radius, radius2));
    } else{
       System.out.println("Your circles do not have equal radius! Their sum area is " + Circle.Sum(radius, radius2));
    }
      
    }

    //Code for user choosing rectangle
    else if(choice == 2){
      
      //Gets user input for length
      System.out.println("Please enter your desired rectangle length:");

      double length = keyboard.nextDouble();

      //Gets user input for width
      System.out.println("Please enter your desired rectangle width:");

      double width = keyboard.nextDouble();

      //Instance of rectangle class
      Rectangle myRect = new Rectangle();

      //Sets the length
      myRect.setLength(length);

      //Sets the width
      myRect.setWidth(width);

      //Prints out area
      System.out.println("Your rectangle area was " + myRect.getArearec());
    }
    //Code for user choosing triangle
    else if(choice == 3){

      //Gets user input for base
      System.out.println("Please enter your desired triangle base:");

      double base = keyboard.nextDouble();

      //Gets user input for height
      System.out.println("Please enter your desired triangle height:");

      double height = keyboard.nextDouble();

      //Instance of triangle class
      Triangle myTri = new Triangle();

      //Sets the length
      myTri.setBase(base);

      //Sets the width
      myTri.setHeight(height);

      //Prints out area
      System.out.println("Your triangle area was " + myTri.getAreatri());
    }
    //Code if the user selects trapezoid
    else if(choice == 4){
      
      //Gets user input for top base
      System.out.println("Please enter your desired trapezoid top base:");

      double tBase = keyboard.nextDouble();

      //Gets user input for bottom base
      System.out.println("Please enter your desired trapezoid bottom base:");

      double bBase = keyboard.nextDouble();
      
      //Gets user input for height
      System.out.println("Please enter your desired trapezoid height:");

      double height = keyboard.nextDouble();
      
      //Prints out user trapezoid area using static method
      System.out.println("Your trapezoid area is " + Trapezoid.inTheTrap(height, tBase, bBase));

      
    }
    //Code for user choosing an invalid input which will shutdown the program
    else{
      System.out.println("Invalid input, program will now shutdown.");
      System.exit(0);
    }
  }
}