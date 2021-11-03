import java.util.Scanner;
public class task15
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
   int line=sc.nextInt();
   // System.out.println("Enter a num");
   //int n=sc.nextInt();
   for(int i=1;i<=line;i++){
    for(int c=line-1;c>=i;c--){
      System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
      System.out.print("*");
    }
    System.out.println();
   }
   
   }
  }
