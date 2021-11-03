import java.util.Scanner;
public class task21
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int line=sc.nextInt();
    for(int c=1;c<=line;c++){
      for(int i=line-1;i>=c;i--){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*c)-1;j++){
        if(c==1||c==line||j==1||j==2*c-1){
          System.out.print(j);
        }else{
        System.out.print(" ");
        }
      }
       System.out.println();
    }
  }
}