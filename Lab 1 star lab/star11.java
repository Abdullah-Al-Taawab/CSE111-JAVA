import java.util.Scanner;
public class star11
{
  public static void main(String args[])
  {
    Scanner mew=new Scanner(System.in);
    int a=mew.nextInt();
    for(int row=1;row<=a;row++)
    {
      
      for(int z=1;z<=(a-row);z++)
      {
        
        
        System.out.print(" ");
      }
      
      for(int col=a-row+1;col<=a;col++)
      {
        
        System.out.print(col);
        
      }
      
      System.out.println();
      
      
    }
    
  }
}
