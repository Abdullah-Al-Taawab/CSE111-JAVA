import java.util.Scanner;
public class task02
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int line=sc.nextInt();
    System.out.println("Enter a num");
    int N=sc.nextInt();
    for(int c=1;c<=line;c++){
      for(int i=1;i<=N;i++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  }
