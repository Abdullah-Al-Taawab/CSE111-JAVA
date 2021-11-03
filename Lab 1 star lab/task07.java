import java.util.Scanner;
public class task07
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int line=sc.nextInt();
    for(int c=1;c<=line;c++){
      for(int k=line-1;k>=c;k--){
        System.out.print(" ");
      }
      for(int i=1;i<=c;i++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}