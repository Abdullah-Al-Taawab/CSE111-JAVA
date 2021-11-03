public class Vehicle
{
  int x=0;
  int y=0;
  public String toString(){
    return (String.format(""+"(" + x + ")")+","+ "("+y+")");  
  }
  public int moveUp(){
    return y++;
  }
    public int moveLeft(){
     return x--;
  }
      public int moveDown(){
     return y--;
      }
        public int moveRight(){
      return x++;  
        }
  
}
  