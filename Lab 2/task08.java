import java.util.Scanner;
public class task08
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int [10];
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      b[a[c]]++;
      
    }
    for(int i=0;i<b.length;i++){
      if(b[i]>=2 && b[i]<5){
        System.out.println(i);
      }
    }
  }
}
//AAT

