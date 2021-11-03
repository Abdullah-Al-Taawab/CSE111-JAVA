import java.util.Scanner;
public class task01
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
    }
    for(int c=a.length-1;c>=0;c--){
      System.out.print(a[c]);
    }
  }
}
//AAT