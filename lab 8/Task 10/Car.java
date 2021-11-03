public class Car{
  private int year;
  private static int count;
  
  public Car(int year){
    this.year = year;
    count++;
  }
  public static int getObjectCount(){
    return count;
  }
  public int getYear(){
    return year;
  }
}