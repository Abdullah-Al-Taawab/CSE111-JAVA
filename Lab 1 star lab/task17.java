import java.util.Scanner;
public class task17
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int n=sc.nextInt();
    for(int c=1;c<=n;c++){
      for(int i=1;i<=c;i++){
        if(c==1||c==n||i==1||i==c){
       System.out.print(i);
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
  }
}