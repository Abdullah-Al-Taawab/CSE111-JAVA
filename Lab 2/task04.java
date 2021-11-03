import java.util.Scanner;
public class task04
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    System.out.println("Enter a num");
    a[0]=sc.nextInt();
    int n=0,c; 
    for(c=1;c<a.length;c++){
      System.out.println("Enter a num");
      a[n]=sc.nextInt();
      for(int i=0;i<c;i++){
        if(a[n]==a[i]){
          c--;
          System.out.println("Enter other num");
          break;
        }
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]);
    }
  }
}
//AAT
