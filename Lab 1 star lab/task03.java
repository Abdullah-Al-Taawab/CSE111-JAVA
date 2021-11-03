import java.util.Scanner;
public class task03
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int n=sc.nextInt();
    System.out.println("Enter a num");
    int n2=sc.nextInt();
    for(int c=1;c<=n;c++){
      for(int i=1;i<=n2;i++){
       System.out.print("*");
      }
      System.out.println();
    }
    
  }
}