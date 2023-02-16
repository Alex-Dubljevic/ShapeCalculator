public class Trapezoid{
  private double height;
  private double botBase;
  private double topBase;

  //Set Height
  public void setHeight(double h){
    height = h;
  }
  //Set Bottom Base
  public void setTopBase(double t){
    topBase = t;
  }
  //Set Top Base
  public void setBotBase(double b){
    botBase = b;
  }

  //Get Height
  public double getHeight(){
    return height;
  }
  //Get Top Base
  public double getTopBase(){
    return topBase;
  }
  //Get Bottom Base
  public double getBotBase(){
    return botBase;
  }
  //Get Area
  public double getArea(){
    return ((botBase+topBase)/2)*height;
  }
  

  //Static method that calculates area
  public static double inTheTrap(double height, double topBase, double botBase){
    
    Trapezoid theTrap = new Trapezoid();
    theTrap.setHeight(height);
    theTrap.setTopBase(topBase);
    theTrap.setBotBase(botBase);
    
    return theTrap.getArea();
  }
}