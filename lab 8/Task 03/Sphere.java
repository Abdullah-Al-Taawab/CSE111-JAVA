public class Sphere extends Point{
  Sphere(double r){
    super(r);
  }
  public double area;
  
  public double sphCalArea(){
    double x = getRadius();
    area = 4*3.1416*(x*x);
    return area;
  }
  public double space(){
    System.out.println("The area of the Sphere :"+sphCalArea());
    return 0;
  }
}