public class Circle extends Point{
  Circle(double r){
    super(r);
  }
  public double area;
  
  public double cirCalArea(){
    double x = getRadius();
    area = 3.1416*(x*x);
    return area;
  }
  public double space(){
    System.out.println("The area of the circle :"+cirCalArea());
    return 0;
  }
}