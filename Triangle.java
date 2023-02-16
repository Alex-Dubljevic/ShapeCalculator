public class Triangle{
  
  private double height;
  private double base;

  //Set the height
  public void setHeight(double h){
    height = h;
  }

  //Set the base
  public void setBase(double b){
    base = b;
  }

  //Get the height
  public double getHeight(){
    return height;
  }

  //Get the base
  public double getBase(){
    return base;
  }

  //Get the area
  public double getAreatri(){
    return 0.5*base*height;
  }
}