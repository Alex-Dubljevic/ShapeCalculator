import java.lang.Math.*;

public class Circle{
  
  private double radius;
  private double radius2;

  //Set the radius
  public void setRadius(double r){
    radius = r;
  }

  //Set the radius of 2nd circle
  public void setRadius2(double r2){
    radius2 = r2;
  }

  //Check if 2 circles have same radius
  public boolean isEqual(){
    if (radius == radius2){
      return true;
    }
    return false;
  }

  //Get the radius
  public double getRadius(){
    return radius;
  }

  //Get the area
  public double getArea(){
    return Math.PI*radius*radius;
  }

  //Get the circumference
  public double getCircumference(){
    return Math.PI*radius*2;
  }

  //Class method which takes 2 radii and adds them, returning the new value
  public static double Sum(double rad1, double rad2){
    double total = rad1 + rad2;
    Circle added = new Circle();
    added.setRadius(total);
    return added.getArea();
  }
}